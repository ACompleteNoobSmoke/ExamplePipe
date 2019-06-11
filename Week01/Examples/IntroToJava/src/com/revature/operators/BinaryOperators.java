package com.revature.operators;

public class BinaryOperators {
	/*
	 * When we use binary operators, we'll have arguments on both
	 * side of the operator. Example: int x = 5
	 */
	
	public static void main(String args[]) {
		int x = 0; //This is the assignment operator. It assigns a value of 0 to x.
		int y = 4;
		int answer = x + y;
		int answer2 = x - y;
		int answer3 = x * y;
		int answer4 = x / y;
		
		x += y; //This is equivalent to saying x = x + y
		y -= x; //This is equivalent to saying y = y -x 
		x *= x; //This is equivalent to saying x = x * x
		
		//There's also a special operator called the modulus operator.
		//It returns the remainder.
		
		int d = x % y;
	}
}
