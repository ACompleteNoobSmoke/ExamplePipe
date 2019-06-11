package com.revature.primitives;

public class WrapperClasses {

	/*
	 * Wrapper classes are object representations of the primitive
	 * data types.
	 */
	
	public static void main(String[] args) {
		Integer i = new Integer(5);
		Double d = new Double(3.4);
		Long l = new Long(45);
		Boolean b = new Boolean(true);
		Float f = new Float(45.5);
		//When Java wraps byte and short, it interprets the values
		//passed to the constructor as an int, meaning that we have
		//to cast the argument as the type we want.
		Byte by = new Byte((byte) 4);
		Character c = new Character('c');
		Short s = new Short((short) 45);
		
		//Autoboxing
		//Autounboxing
	}
}
