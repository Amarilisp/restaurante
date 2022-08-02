package com.restaurante.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restaurante.rest.model.Pedido;  

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer>  
{  
}  