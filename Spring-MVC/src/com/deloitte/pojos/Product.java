package com.deloitte.pojos;

public class Product {

	private int id;
	private String productName;
	private int price;
	
	

	public Product( String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	} 
}
