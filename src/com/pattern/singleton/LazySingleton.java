package com.pattern.singleton;

public class LazySingleton {

	private static LazySingleton uniqueInstance;
	
	private LazySingleton() {}
	
	//Synchronized for multithreading protection
	public static synchronized LazySingleton getInstance() { 
		
		if(uniqueInstance == null) {
					
			uniqueInstance = new LazySingleton();
			
		}
		
		return uniqueInstance;
	}
	
	
	
	
}
