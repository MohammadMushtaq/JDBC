package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class IceCreamDto implements Serializable {

	
	private int id;
	private String flavour;
	private String name;
	private int price ;
	public IceCreamDto() {
		// TODO Auto-generated constructor stub
	}
	public IceCreamDto(int id, String flavour, String name, int price) {
		super();
		this.id = id;
		this.flavour = flavour;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "IceCreamDto [id=" + id + ", flavour=" + flavour + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public String getFlavour() {
		return flavour;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
}

