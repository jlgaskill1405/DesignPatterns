package com.pattern.decorator;

public abstract class CondimentDecorator extends Beverage {

	public Beverage beverage;
	
	public abstract String getDescription();
	
	public Size getSize() {
		
		return this.beverage.getSize();
	}

}
