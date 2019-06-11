package com.revature.operators;

import com.revature.classes.Wizard;

public class TertiaryOperators {

	public static void main(String[] args) {
		
		int x = 4;
		
		//This syntax allows us to assign a string literal to s based on some condition. The first
		//string is assigned to s if the condition is true while the second is assigned to s if the
		//condition is false.
		Wizard w = (x < 5) ? new Wizard("Ron") : new Wizard("Hermione");
	}
}
