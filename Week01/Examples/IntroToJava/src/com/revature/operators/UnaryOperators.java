package com.revature.operators;

public class UnaryOperators {

	public static int x = 0;
	
	public static void main(String[] args) {
		
		//Unary operators in Java only operate on one variable.
		//For instance, the ++ or -- operators are applied to
		//a single variable
		
		//This is what we call a post increment operator. It increments
		//x after it prints it to the console.
		System.out.println(x++); //0
		System.out.println(x); //1
		
		//This is what we call a pre increment operator. It increments
		//x first and then prints it to the console.
		System.out.println(++x); //2
		
		System.out.println(x--); //2
		System.out.println(x); //1
		System.out.println(--x); //0
	}
}
