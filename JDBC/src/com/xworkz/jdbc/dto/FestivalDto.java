package com.xworkz.jdbc.dto;

public class FestivalDto {
private int id;
private String name;
private int date;
private String state;

public FestivalDto() {
	// TODO Auto-generated constructor stub
}

public FestivalDto(int id, String name, int date, String state) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
	this.state = state;
}


@Override
public String toString() {
	return "FestivalDto [id=" + id + ", name=" + name + ", date=" + date + ", state=" + state + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDate() {
	return date;
}

public void setDate(int date) {
	this.date = date;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

}
