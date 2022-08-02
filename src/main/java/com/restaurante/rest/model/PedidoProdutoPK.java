package com.restaurante.rest.model;

import java.io.Serializable;
import java.util.Objects;

public class PedidoProdutoPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8888228171772100183L;
	private Integer idPedido;
	private Integer idProduto;

    // default constructor

    public PedidoProdutoPK(Integer idPedido, Integer idProduto) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
    }

	@Override
	public int hashCode() {
		return Objects.hash(idPedido, idProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoProdutoPK other = (PedidoProdutoPK) obj;
		return Objects.equals(idPedido, other.idPedido) && Objects.equals(idProduto, other.idProduto);
	}
    

}