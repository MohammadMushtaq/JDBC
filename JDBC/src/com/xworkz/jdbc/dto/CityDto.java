package com.xworkz.jdbc.dto;

public class CityDto {
	
	private int id;
	private String name;
	private double population;
	private String famousFor;
	
	public CityDto() {
		// TODO Auto-generated constructor stub
	}

	public CityDto(int id, String name, double population, String famousFor) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "CityDao [id=" + id + ", name=" + name + ", population=" + population + ", famousFor=" + famousFor + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPopulation() {
		return population;
	}

	public String getFamousFor() {
		return famousFor;
	}
	

}
