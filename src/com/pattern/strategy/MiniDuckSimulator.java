package com.pattern.strategy;

public class MiniDuckSimulator {

	
	public static void main(String[] args) {
		
		
		Duck modelDuck = new ModelDuck();
		
		modelDuck.performQuack();
		
		modelDuck.display();
		
		modelDuck.performFly();	
		
		modelDuck.setFlyBehavior(new FlyWithRocket());
		
		modelDuck.performFly();
		
		
	}
	
}
