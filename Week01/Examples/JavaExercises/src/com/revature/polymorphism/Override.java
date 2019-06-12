package com.revature.polymorphism;

/*
 * Override the following methods:
 */

public class Override {
	
	protected void printStuff() {
		System.out.println("Print Stuff");
	}
	
	public int addStuff(int a, int b) {
		return a + b;
	}
	
	private Object returnAnyObject(Object o) {
		return o;
	}
}

