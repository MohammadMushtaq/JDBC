package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class ClubDTO implements Serializable{
	
	private int id;
	private String name;
	private String location;
	private int bouncers;
	
	public ClubDTO(int id, String name, String location, int bouncers) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.bouncers = bouncers;
	}
	
	@Override
	public String toString() {
		return "ClubDTO [id=" + id + ", name=" + name + ", location=" + location + ", bouncers=" + bouncers + "]";
	}

	public ClubDTO() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getBouncers() {
		return bouncers;
	}

	
	
	

}
