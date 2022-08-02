package com.restaurante.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.rest.model.PedidoProduto;
import com.restaurante.rest.repository.PedidoProdutoRepository;

@Service
public class PedidoProdutoService implements IPedidoProdutoService {
	
	@Autowired
	PedidoProdutoRepository pedidoRepository; 
	
	@Override
	public List<PedidoProduto> findAll() {

		final List<PedidoProduto> pedidos = new ArrayList<PedidoProduto>();  
		pedidoRepository.findAll().forEach(pedido -> pedidos.add(pedido));  
		return pedidos;
	}

	@Override
	public PedidoProduto saveOrUpdate(PedidoProduto per) {
		return pedidoRepository.save(per);
	}

	@Override
	public void deleteById(int id) {
		pedidoRepository.deleteById(id);
	}

	@Override
	public PedidoProduto getById(int id) {
		Optional<PedidoProduto> findById = pedidoRepository.findById(id);
		return findById.isPresent()? findById.get():null;
	}
	
	@Override
	public void deleteAll() {
		pedidoRepository.deleteAll();

	}

	@Override
	public List<PedidoProduto> findAllByIdPedido(int idPedido) {
		return pedidoRepository.findAllByIdPedido(idPedido);
	}

}