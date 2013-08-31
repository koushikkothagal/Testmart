package org.koushik.javabrains.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="Product")
@XmlType(propOrder={"price", "sku", "name"} )
public class Product {

	private String name;
	private String sku;
	private double price;
	
	
	public Product() {
		
	}
	
	public Product(String name, String sku, double price) {
		this.name = name;
		this.price = price;
		this.sku = sku;
	}
	
	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
