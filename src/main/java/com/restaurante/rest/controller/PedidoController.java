package com.restaurante.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.restaurante.rest.model.Pedido;
import com.restaurante.rest.model.PedidoProduto;
import com.restaurante.rest.model.PedidoProdutoPK;
import com.restaurante.rest.model.Produto;
import com.restaurante.rest.service.IPedidoProdutoService;
import com.restaurante.rest.service.IPedidoService;
import com.restaurante.rest.service.IProdutoService;

@Controller
public class PedidoController {
	@Autowired
	private IPedidoService pedidoService;
	@Autowired
	private IProdutoService produtosService;
	
	@Autowired
	private IPedidoProdutoService pedidoProdutosService;
		
	@GetMapping({"/newpedido", "/"})
	public String createPedido(Model modelo) {
		Pedido pedido = new Pedido();
		Integer numeroMesaQueIriaVirDoCodigoQR = 11;
		pedido.setNroMesa(numeroMesaQueIriaVirDoCodigoQR);
		Pedido saveOrUpdate = pedidoService.saveOrUpdate(pedido);
		modelo.addAttribute("idPedido", saveOrUpdate.getId());
		modelo.addAttribute("produtos", produtosService.findAll());
		modelo.addAttribute("totalPedido", 0);
		return "produtos";
	}
	
	@GetMapping({"/adicionar/{idPedido}/produto/{idProduto}"})
	public String adicionarProduto(@PathVariable("idPedido") String idPedido,@PathVariable("idProduto") String idProduto ,Model modelo) {
		PedidoProdutoPK pedidoProdutoPK = new PedidoProdutoPK(Integer.parseInt(idPedido),Integer.parseInt(idProduto));
		PedidoProduto pedidoProdutoToSave = pedidoProdutosService.getById(pedidoProdutoPK.hashCode());
		
		Produto produto = produtosService.getById(Integer.parseInt(idProduto));
		
		if(pedidoProdutoToSave == null) {
			pedidoProdutoToSave = new PedidoProduto();
			pedidoProdutoToSave.setIdPedidoProduto(pedidoProdutoPK.hashCode());
			pedidoProdutoToSave.setQuantidade(0);
			pedidoProdutoToSave.setPreco(produto.getPreco());
			pedidoProdutoToSave.setNomeProduto(produto.getNomeProduto());
			pedidoProdutoToSave.setIdPedido(Integer.parseInt(idPedido));
		}
		pedidoProdutoToSave.setQuantidade(pedidoProdutoToSave.getQuantidade()+1);
		pedidoProdutosService.saveOrUpdate(pedidoProdutoToSave);
		
		updateView(idPedido, modelo);

		return "produtos";
	}
	
	@GetMapping({"/remover/{idPedido}/pedidoproduto/{idPedidoProduto}"})
	public String removerProduto(@PathVariable("idPedido") String idPedido,@PathVariable("idPedidoProduto") String idPedidoProduto , Model modelo) {
		PedidoProduto pedidoToRemove = pedidoProdutosService.getById(Integer.parseInt(idPedidoProduto));
		if(pedidoToRemove.getQuantidade()==1) {
			pedidoProdutosService.deleteById(Integer.parseInt(idPedidoProduto));
		}else {
			pedidoToRemove.setQuantidade(pedidoToRemove.getQuantidade()-1);
			pedidoProdutosService.saveOrUpdate(pedidoToRemove);
		}

		updateView(idPedido, modelo);
		
		return "produtos";

	}

	private void updateView(String idPedido, Model modelo) {
		Double total = Double.valueOf(0);
		
		List<PedidoProduto> findAll = pedidoProdutosService.findAllByIdPedido(Integer.parseInt(idPedido));
		for (PedidoProduto pedidoProduto:findAll) {
			total = total + (pedidoProduto.getQuantidade()*pedidoProduto.getPreco());
		}
		modelo.addAttribute("totalPedido", total);
		modelo.addAttribute("pedidoProdutos", findAll);
		modelo.addAttribute("produtos", produtosService.findAll());
	}
	

}