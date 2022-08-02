package com.restaurante.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "pedidos_produtos")
public class PedidoProduto {

	@Id  
	@Column 
	private Integer idPedidoProduto;
	
	@Column (name="id_pedido")
	private Integer idPedido;

	@Column 
	private Integer idProduto;
	
	@Column 
	private Integer quantidade;
	
	@Column 
	private Double preco;

	@Column  
	private String nomeProduto;


	public PedidoProduto() {
		
	}

	
	

	public Integer getIdPedido() {
		return idPedido;
	}




	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}




	public Integer getIdProduto() {
		return idProduto;
	}




	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}




	public Double getPreco() {
		return preco;
	}




	public void setPreco(Double preco) {
		this.preco = preco;
	}




	public Integer getIdPedidoProduto() {
		return idPedidoProduto;
	}



	public void setIdPedidoProduto(Integer idPedidoProduto) {
		this.idPedidoProduto = idPedidoProduto;
	}



	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}




	public String getNomeProduto() {
		return nomeProduto;
	}




	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	
	
}
