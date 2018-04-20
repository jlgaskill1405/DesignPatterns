package com.pattern.strategy;

public class ModelDuck extends Duck{

	public ModelDuck(){
		
		this.setFlyBehavior(new FlyNoFly());
		this.setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
	
		System.out.println("I'm a model duck.");
		
	}
	
	
}
