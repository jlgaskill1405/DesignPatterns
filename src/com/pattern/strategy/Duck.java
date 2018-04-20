package com.pattern.strategy;

public abstract class Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
		
	public Duck() {
		
	}
	
	public abstract void display();
	
	
	public void performFly() {
		
		flyBehavior.fly();
	}
	
	
	public void performQuack() {
		
		quackBehavior.quack();
	}
	
	public void swim() {
		
		System.out.println("All ducks float down here.");
		
	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	

}
