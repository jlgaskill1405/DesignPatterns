package com.pattern.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		
		this.setDescription("House Blend Coffee");
	}
	
	
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return  .89;
	}

}
