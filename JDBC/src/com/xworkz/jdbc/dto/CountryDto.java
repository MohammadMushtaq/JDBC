package com.xworkz.jdbc.dto;

public class CountryDto {

	private int id;
	private String name;
	private int code;
	private String continent;
	public CountryDto() {
		// TODO Auto-generated constructor stub
	}
	public CountryDto(int id, String name, int code, String continent) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "CountryDto [id=" + id + ", name=" + name + ", code=" + code + ", continent=" + continent + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getCode() {
		return code;
	}
	public String getContinent() {
		return continent;
	}
	
	
	
}
