package com.pattern.decorator;

public abstract class Beverage {
	
	public enum Size{TALL, GRANDE, VENTI};
	
	private String description = "Unknown Beverage";
	private Size size = Size.TALL;
	
	public String getDescription() {
		
		return this.description;
	}
	
	public void setDescription(String description) {
		
		this.description = description;
		
	}
	
	public abstract double cost();
	

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	

}
