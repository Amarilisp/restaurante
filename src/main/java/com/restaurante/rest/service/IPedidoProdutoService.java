package com.restaurante.rest.service;

import java.util.List;

import com.restaurante.rest.model.PedidoProduto;

public interface IPedidoProdutoService {
	List<PedidoProduto> findAll();
	PedidoProduto saveOrUpdate(PedidoProduto per);
	void deleteById(int id);
	PedidoProduto getById(int Id);
	void deleteAll();
	List<PedidoProduto> findAllByIdPedido(int idPedido);

} 
