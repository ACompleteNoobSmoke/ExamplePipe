package com.revature.flowcontrol;

import java.util.ArrayList;
import java.util.List;

import com.revature.classes.Wizard;

public class FlowControl {
	/*
	 * In Java, there are several ways to control the flow of the
	 * application. These include:
	 * 
	 * -for loops
	 * -while loops
	 * -do while loops
	 * -switch statements
	 * -if and/or if/else statements
	 */
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("string");
		list.add(4);
		list.add(new Wizard("Harry"));
		
		//For loops: a for loop will perform a specified block
		//of code a specified number of times (until some condition
		//is met)
		
		for(int i = 0; i < 20; i++) {
			System.out.println(i + " ");
		}
		
		//We can also use an enhanced for loop:
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		//While loops allow us to run a block of code while some
		//statement evaluates to true
		
		int i = 0;
		
		while(i < 1) {
			i++;
			System.out.println(i);
		}
		
		//We can also use do while loops. In do while loops, 
		//our block of code always executes at least once.
		
		do {
			i++;
			System.out.println(i);
		}while(i < 2);
		
		//We can also use switch statements. They follow this syntax:
		
		String s = "string";
		
		switch(s) {
		
		case "hair":
			break;
			
		case "string":
			System.out.println("The value is string");
			break;
			
		case "thing":
			System.out.println("The value is thing");
			break;
			
		default:
			break;
		}
		
		//And, of course, we can use if or if/else
		
		if(s.equals("strin")) {
			System.out.println("s is string");
		}
		else if(s.equals("sfksdjfkl")) {
			System.out.println("nothing happens");
		}else 
			System.out.println("And this is the last option.");
	}
}
