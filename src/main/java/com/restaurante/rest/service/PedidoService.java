package com.restaurante.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.rest.model.Pedido;
import com.restaurante.rest.repository.PedidoRepository;

@Service
public class PedidoService implements IPedidoService {
	
	@Autowired
	PedidoRepository pedidoRepository; 
	
	@Override
	public List<Pedido> findAll() {

		final List<Pedido> pedidos = new ArrayList<Pedido>();  
		pedidoRepository.findAll().forEach(pedido -> pedidos.add(pedido));  
		return pedidos;
	}

	@Override
	public Pedido saveOrUpdate(Pedido per) {
		return pedidoRepository.save(per);
	}

	@Override
	public void deleteById(int id) {
		pedidoRepository.deleteById(id);
	}

	@Override
	public Pedido getById(int id) {
		return pedidoRepository.findById(Integer.valueOf(id)).get();
	}

	@Override
	public void deleteAll() {
		pedidoRepository.deleteAll();

	}

}