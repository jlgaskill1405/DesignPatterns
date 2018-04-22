package com.pattern.decorator;

public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage) {
		
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = this.beverage.cost();

		switch(beverage.getSize()){

			case TALL: cost += .15;
			break;
	
			case GRANDE: cost += .20;
			break;	
	
			case VENTI: cost += .25;
			break;		

		}
		
		return cost;
	}

}
