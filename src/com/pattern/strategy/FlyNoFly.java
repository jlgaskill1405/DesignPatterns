package com.pattern.strategy;

public class FlyNoFly implements FlyBehavior {

	@Override
	public void fly() {

		System.out.println("I can't fly");

	}

}
