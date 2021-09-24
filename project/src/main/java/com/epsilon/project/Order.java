package com.epsilon.project;

import java.util.List;

public class Order {
	int orderId;
	Customer customer;
	List<Book> ordItems;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public List<Book> getOrdItems() {
		return ordItems;
	}
	public void setOrdItems(List<Book> ordItems) {
		this.ordItems = ordItems;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", ordItems=" + ordItems + "]";
	}
	
	
}