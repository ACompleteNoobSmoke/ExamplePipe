package com.revature.primitives;

public class Primitives {

	/*
	 * Java has 8 primitive data types. These primitives are NOT
	 * objects. These are:
	 */

	private int i = 1; //int is a 32 bit integer value
	private char c = 'd'; //char is a 16 bit value (stores a character)
	private byte b = 23; //byte is a 8 bit value (ranges from -128 to 127)
	private float f = 87.4f; //float is 32 bit floating point (a decimal)
	private short s =3453; //short is a 16 bit numeric value
	private boolean bool = true; //boolean stores either "true" or "false"
	private double d = 47893.3; //double is a 64 bit floating point value
	private long l = 984279348; //long is a 64 bit bit integer value
	
	public static void main(String[] args) {
		
		short s = 45;
		short t = 45;
		long longs = 3454;
		int anInt = 4;
		double aDouble = 45.6;
		
		/*
		 * This is called promotion. Java automatically promotes
		 * short values, byte values, and char values to int when
		 * performing operations on them.
		 */
//		short answer = s + t; //DOES NOT COMPILE
		
//		float floaty = 4.5; //DOESN't COMPILE because Java assumes that floating point literals are doubles
		
		float floating = 4.5f;
		
		/*
		 * When performing some operation on primitives of 
		 * different types, Java will promote all data types
		 * to the largest data type.
		 */
		
		long answer2 = s + longs; //The largest
		
		/*
		 * Java will also "promote" integers to floating point values
		 * in order to perform operations on integers and floating point values
		 */
		
		float anotherFloat = anInt + floating;
		
		double lo = aDouble + answer2;
		
		long lo2 = (long) aDouble + answer2; //This is called casting. We are casting our double into a long.
		
		
		
	}
}
