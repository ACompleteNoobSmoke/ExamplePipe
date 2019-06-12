package com.revature.designpatterns;

/*
 * POJO stands for "Plain Old Java Object". While it has to follow
 * the rules laid out by Java (e.g. syntax, etc.), it doesn't have
 * to follow strict rules concerning memberr accessibility and which
 * interfaces it implements.
 */
public class Pojo {

	private int id;
	private String name;
	
	public Pojo() {}
	
	/*
	 * Traditionally, classes have getters and setters. Getters
	 * return instance variables to the caller whereas Setters
	 * alter the value of those variables.
	 */
	public int getId() {
		return id;
	}
	
	/*
	 * The "this" keyword in Java refers to this instance of the
	 * class.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
