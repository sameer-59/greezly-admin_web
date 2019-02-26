package com.cognizant.entity;



public class Product {
	
	private String productId;
	private String productName;
	private String productDescription;
	private String productPrice;
	private String productCategory;
	private String productCompany;
	
	
	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Product(){}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String pid) {
		this.productId = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String price) {
		this.productPrice = price;
	}

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	
	
	

}
