package com.pattern.factorymethod;

public class ChicagoStyleVeggiePizza extends Pizza {
	
	public ChicagoStyleVeggiePizza() {
		
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Bell Peppers");
		toppings.add("Mushrooms");
		toppings.add("Onions");
		toppings.add("Black Olives");
	}
	
	void cut() {
		
		System.out.println("Cutting the pizza into square slices");
	}
	
	

}
