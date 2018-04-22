package com.pattern.decorator;

public class Decaf extends Beverage {

	
	public Decaf() {
		
		this.setDescription("Decaf Coffee");
	}
	
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
