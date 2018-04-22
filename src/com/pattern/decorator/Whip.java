package com.pattern.decorator;

public class Whip extends CondimentDecorator {


	public Whip(Beverage beverage) {
		
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost();

		switch(beverage.getSize()){

			case TALL: cost += .10;
			break;
	
			case GRANDE: cost += .15;
			break;	
	
			case VENTI: cost += .20;
			break;		

		}
		
		
		return cost;
	}

}
