package com.tnsif.sm.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product
{
    private Integer productid;
    private String name;
    private String description;
    private float price;
    private Integer stockQuantity;
    private String category;
    private Integer storeid;
    
    //Constructor
    public Product()
    {
    	
    }
	public Product(Integer productid, String name, String description, float price, Integer stockQuantity,
			String category, Integer storeid) 
	{
		
		this.productid = productid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.category = category;
		this.storeid = storeid;
	}
    //Getters and Setters
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getStoreid() {
		return storeid;
	}
	public void setStoreid(Integer storeid) {
		this.storeid = storeid;
	}
	 
}
