package org.zj.eureka.order.model;

import java.io.Serializable;

public class OrderModel implements Serializable{
	
	private String id;
	private	Double price;
	private String address;
	private String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", price=" + price + ", address=" + address + ", phone=" + phone + "]";
	}

}
