package com.pattern.factorymethod;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {

		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Bell Peppers");
		toppings.add("Mushrooms");
		toppings.add("Onions");
		toppings.add("Black Olives");

	}

	
}
