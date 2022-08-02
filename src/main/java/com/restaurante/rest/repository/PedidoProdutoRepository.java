package com.restaurante.rest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restaurante.rest.model.PedidoProduto;  

@Repository
public interface PedidoProdutoRepository extends CrudRepository<PedidoProduto, Integer>  
{  
	List<PedidoProduto> findAllByIdPedido(int idPedido);

}  