/*
 * This specifies which package in which
 * we can find the class definitions in
 * this file.
 */
package com.revature.classes;

public class Potter extends Wizard{

	public Potter() {
		//The first line of any constructor is super(); This is a
		//call to the parent class' constructor.
		//NOTE: If the parent class doesn't have a default constructor
		//or an explicitly defined no-args constructor, we must explicitly
		//call the parent's constructor.
		super("Harry");
	}
}
