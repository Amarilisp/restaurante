package com.restaurante.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restaurante.rest.model.Produto;  

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>  
{  
}  