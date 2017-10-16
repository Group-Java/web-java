package com.websystique.springmvc.model;

public class Car {
	private String name;
	private String brand;
	private String date;
	private Double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		StringBuilder st=new StringBuilder();
		st.append("Hieu: ").append(getBrand())
		.append("Ten: ").append(getName());
		return st.toString();
	}
}
