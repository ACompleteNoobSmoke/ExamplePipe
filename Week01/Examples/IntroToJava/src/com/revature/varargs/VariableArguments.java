package com.revature.varargs;

public class VariableArguments {

	/*
	 * In Java, we can take advantage of Variable Arguments (referred
	 * to as "var args" for short) in order to pass a variable number
	 * of arguments for a method.
	 */
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		System.out.println(va.add(5, 5));
		
		System.out.println(va.add(4, 4, 5));
		
		System.out.println(va.add(4, 5, 3, 2, 6, 7));
		
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int add(int x, int y, int z) {
		return x + y + z;
	}
	
	/*
	 * If you use var args, the variable parameter must be the very
	 * last parameter. Not only that, you can't have multiple variable
	 * parameters.
	 */
	public int add(int...s) {
		int sum = 0;
		
		for(int i : s) {
			sum += i;
		}
		
		return sum;
	}
}
