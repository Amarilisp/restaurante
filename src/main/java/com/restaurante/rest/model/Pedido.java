package com.restaurante.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "pedidos")
public class Pedido {

	@Id  
	@Column 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer nroMesa;

	public Pedido() {
		
	}

	
	
	public Integer getNroMesa() {
		return nroMesa;
	}



	public void setNroMesa(Integer nroMesa) {
		this.nroMesa = nroMesa;
	}



	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}
	
}
