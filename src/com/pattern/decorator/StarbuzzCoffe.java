package com.pattern.decorator;

import com.pattern.decorator.Beverage.Size;

public class StarbuzzCoffe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage beverage = new Espresso();
		beverage.setSize(Size.GRANDE);
		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(Size.VENTI);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new Decaf();
		beverage3.setSize(Size.VENTI);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		beverage3 = new SteamedMilk(beverage3);
		
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		

	}

}
