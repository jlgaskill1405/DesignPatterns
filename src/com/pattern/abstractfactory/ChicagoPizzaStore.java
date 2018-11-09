package com.pattern.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {

	@SuppressWarnings("unused")
	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		
		String pizzaType = type.toLowerCase().substring(0,1).toUpperCase() + type.substring(1);
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		switch(type) {
		
		case "cheese" : pizza = new CheesePizza(ingredientFactory);
		break;

		case "veggie" : pizza = new VeggiePizza(ingredientFactory);
        break;
		
		case "clam" : pizza = new ClamPizza(ingredientFactory);
		break;

		case "pepperoni" : pizza = new PepperoniPizza(ingredientFactory);
		break;

		default: pizza = null;
				
		}

		if(pizza != null && type != null) {
			pizza.setName("Chicago Style " + pizzaType + " Pizza");
		}
		return pizza;
		
	}

}
