package com.restaurante.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "produtos")
public class Produto {

	@Id  
	@Column 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column  
	private String nomeProduto;
	@Column  
	private String descricao;
	@Column  
	private Double preco;

	Produto(){
		
	}

	public Produto(Integer id, String nomeProduto) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
}
