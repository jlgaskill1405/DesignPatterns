package com.pattern.decorator;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = this.beverage.cost();

		switch(beverage.getSize()){

			case TALL: cost += .20;
			break;
	
			case GRANDE: cost += .25;
			break;	
	
			case VENTI: cost += .30;
			break;		

		}
		
		
		return cost;
	}

}
