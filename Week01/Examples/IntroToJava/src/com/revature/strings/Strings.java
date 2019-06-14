package com.revature.strings;

import com.revature.classes.Wizard;

import static com.revature.fileio.FileExample.br;

public class Strings {

	Wizard w = new Wizard("harry");
	/*
	 * When we create a string using a string literal, Java stores
	 * it in the String pool (which is located on the heap); Java
	 * will reuse strings which already exist in the String pool.
	 * 
	 * If you choose to create a string with the "new" keyword,
	 * you're being inefficient, and I will make you rewrite your
	 * code.
	 */
	 static String s = "a string";
	 static String aString = new String();
	
	/*
	 * The String class is a final class, which means that we
	 * can't actually extend it.
	 * 
	 * Strings are immutable, so we can't actually change them.
	 * For instance:
	 * 
	 */
	
	public static void main(String[] args) {
		String p = s.concat(" is a string");
		System.out.println(s);
		System.out.println(p);
		
		/*
		 * If you want to have access to a "mutable" String, you
		 * must use either StringBuilder or StringBuffer.
		 */
		
		StringBuilder sb = new StringBuilder();
		sb.append("a string");
		sb.append("fdkjfalk");
		System.out.println(sb);
		
		StringBuffer sbuff = new StringBuffer();
		sbuff.append("the original string builder");
		sbuff.append(" and I'm inefficient");
		System.out.println(sbuff);
	}
	
}
