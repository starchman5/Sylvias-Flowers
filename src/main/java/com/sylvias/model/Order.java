package com.sylvias.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Orders")
public class Order implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	@Column
	private String name;
	
	@Column
	private String price;
	
	@Column
	private String flower1;
	
	@Column
	private String flower2;
	
	@Column
	private String flower3;
	
	@Column
	private String vase;
	
	@Column
	private String card_message;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFlower1() {
		return flower1;
	}

	public void setFlower1(String flower1) {
		this.flower1 = flower1;
	}

	public String getFlower2() {
		return flower2;
	}

	public void setFlower2(String flower2) {
		this.flower2 = flower2;
	}

	public String getFlower3() {
		return flower3;
	}

	public void setFlower3(String flower3) {
		this.flower3 = flower3;
	}

	public String getVase() {
		return vase;
	}

	public void setVase(String vase) {
		this.vase = vase;
	}

	public String getCard_message() {
		return card_message;
	}

	public void setCard_message(String card_message) {
		this.card_message = card_message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(card_message, flower1, flower2, flower3, name, orderId, price, vase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(card_message, other.card_message) && Objects.equals(flower1, other.flower1)
				&& Objects.equals(flower2, other.flower2) && Objects.equals(flower3, other.flower3)
				&& Objects.equals(name, other.name) && orderId == other.orderId && Objects.equals(price, other.price)
				&& Objects.equals(vase, other.vase);
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", price=" + price + ", flower1=" + flower1
				+ ", flower2=" + flower2 + ", flower3=" + flower3 + ", vase=" + vase + ", card_message=" + card_message
				+ "]";
	}

	public Order(int orderId, String name, String price, String flower1, String flower2, String flower3, String vase,
			String card_message) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.price = price;
		this.flower1 = flower1;
		this.flower2 = flower2;
		this.flower3 = flower3;
		this.vase = vase;
		this.card_message = card_message;
	}
	
	

}