package com.restaurante.rest.service;

import java.util.List;

import com.restaurante.rest.model.Pedido;

public interface IPedidoService {
	List<Pedido> findAll();
	Pedido saveOrUpdate(Pedido per);
	void deleteById(int id);
	Pedido getById(int Id);
	void deleteAll();

} 
