package com.xworkz.jdbc.dto;

public class StateDto {

	private int id;
	private String name;
	private int code;
	private String capital;
	
	public StateDto() {
		// TODO Auto-generated constructor stub
	}

	public StateDto(int id, String name, int code, String capital) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "StateDto [id=" + id + ", name=" + name + ", code=" + code + ", capital=" + capital + "]";
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

	public String getCapital() {
		return capital;
	}

	
	
}
