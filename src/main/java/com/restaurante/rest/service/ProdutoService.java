package com.restaurante.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.rest.model.Produto;
import com.restaurante.rest.repository.ProdutoRepository;

@Service
public class ProdutoService implements IProdutoService {
	
	@Autowired
	ProdutoRepository repository; 
	
	@Override
	public List<Produto> findAll() {

		final List<Produto> entities = new ArrayList<>();  
		repository.findAll().forEach(entity -> entities.add(entity));  
		return entities;
	}

	@Override
	public Produto getById(int id) {
		return repository.findById(Integer.valueOf(id)).get();
	}
}