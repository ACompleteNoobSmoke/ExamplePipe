package com.revature.designpatterns;

class Car{}

class Honda extends Car{}

class Toyota extends Car{}

class Mazda extends Car{}


/*
 * The Factory design pattern is named so because its purpose is
 * to act as a factory that returns different instances of classes,
 * etc.
 */

public class Factory {

	/*
	 * There shall only be one Factory in this application, so we
	 * can make the constructor private.
	 */
	private Factory() {}
	
	public static Car getCar(String car) {
		
		if(car == null) {
			return null;
		}else if(car.equalsIgnoreCase("honda")) {
			return new Honda();
		}else if(car.equalsIgnoreCase("toyota")) {
			return new Toyota();
		}else if(car.equalsIgnoreCase("mazda")) {
			return new Mazda();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(Factory.getCar("Mazda"));
		System.out.println(Factory.getCar("toyota"));
	}
}
