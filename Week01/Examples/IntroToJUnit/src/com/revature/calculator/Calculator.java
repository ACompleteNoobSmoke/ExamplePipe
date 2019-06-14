package com.revature.calculator;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public int remainder(int a, int b) {
		return a%b;
	}
	
	public int absoluteValue(int x) {
		if(x < 0) return -x;
		return x;
	}
}
