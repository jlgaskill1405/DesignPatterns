package com.pattern.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		
		switch(type) {
		
		case "cheese" : return new NYStyleCheesePizza();

		case "veggie" : return new NYStyleVeggiePizza();

		case "clam" : return new NYStyleClamPizza();

		case "pepperoni" : return new NYStylePepperoniPizza();

		default: return null;
				
		}
		
	}

}
