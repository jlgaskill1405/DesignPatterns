package com.pattern.abstractfactory;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		
		PizzaStore nyPizzaStore = new NYPizzaStore();
		
		nyPizzaStore.orderPizza("cheese");
		
	}

}
