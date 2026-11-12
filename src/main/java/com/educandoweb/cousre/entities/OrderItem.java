package com.educandoweb.cousre.entities;

import java.io.Serializable;
import java.util.Objects;

import com.educandoweb.cousre.entities.pk.OrderItemPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_OrderItem")
public class OrderItem implements Serializable{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPk orderItemPk;
	
	private Integer quantity;
	private Double price;
	
	public OrderItem () {
		
	}

	//Nesse construtor os argumentos product e order foram inseridos manualmente
	public OrderItem(Product product, Order order,  Integer quantity, Double price) {
		super();
		this.quantity = quantity;
		this.price = price;
		orderItemPk.setOrder(order);
		orderItemPk.setProduct(product);
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//OS GETERS E SETERS DOS PRODUTOS E PEDIDOS FORAM CRIADOS MANUALMENTE PARA PODER ACESSAR O PRODUCTO E ORDER DA ORDERITEMPK
	public Product getProduct() {
		return orderItemPk.getProduct();
	}
	
	public void setProduct(Product product) {
		orderItemPk.setProduct(product);
	}
	
	public Order getOrder() {
		return orderItemPk.getOrder();
	}
	
	public void setOrder(Order order) {
		orderItemPk.setOrder(order);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderItemPk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(orderItemPk, other.orderItemPk);
	}
	
	
	
	
}
