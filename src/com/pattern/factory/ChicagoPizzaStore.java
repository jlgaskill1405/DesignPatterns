package com.pattern.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		switch(type) {
		
		case "cheese" : return new ChicagoStyleCheesePizza();

		case "veggie" : return new ChicagoStyleVeggiePizza();

		case "clam" : return new ChicagoStyleClamPizza();

		case "pepperoni" : return new ChicagoStylePepperoniPizza();

		default: return null;
				
		}
	}

}
