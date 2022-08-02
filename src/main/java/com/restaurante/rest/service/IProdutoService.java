package com.restaurante.rest.service;

import java.util.List;

import com.restaurante.rest.model.Produto;

public interface IProdutoService {
	List<Produto> findAll();
	Produto getById(int Id);
} 
