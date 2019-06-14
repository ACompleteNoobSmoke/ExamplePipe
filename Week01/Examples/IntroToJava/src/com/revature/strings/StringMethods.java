package com.revature.strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "a string";
		String t = "nother string that will be split";
		String u = " some thing";
		String z = "A STRING";
		
		String concatenatedString = s.concat(u);
		System.out.println(concatenatedString);
		
		/*
		 * This method returns the character at a specified index.
		 * If your index is out of bounds, you'll get a
		 * StringIndexOutOfBoundsException.
		 */
		System.out.println(s.charAt(0));
		
		//The equals method is already overridden in the string
		//class, so it already compares the objects' equality.
		System.out.println(s.equals(t));
		
		/*
		 * The equalsIgnoreCase method checks for string equality,
		 * ignoring the capitalization/case of the characters.
		 */
		System.out.println(s.equalsIgnoreCase(z));
		
		/*
		 * The length() returns the length of the String.
		 */
		System.out.println(u.length());
		
		/*
		 * When using the substring method, the final index
		 * argument is NOT included in the returned string.
		 */
		System.out.println(u.substring(1, 5));
		
		/*
		 * The trim method removes all leading and trailing
		 * whitespace within a string.
		 */
		System.out.println(u.trim());
		
		u.toUpperCase();
		u.toLowerCase();
		
		/*
		 * The split method will return an array of strings.
		 * It splits a string around a regular expression. In this
		 * case, we've chosen a single space " " as our regular
		 * expression, but you can choose any regular expression.
		 */
		String[] splitString = t.split(" ");
		
		/*
		 * When using "length" with arrays, it's a property --
		 * NOT a method.
		 */
		for(int i = 0; i < splitString.length; i++) {
			System.out.println(splitString[i]);
		}
		
		System.out.println(t.indexOf("that"));
		
		/*
		 * This method replaces the specified character with a 
		 * new character (our second argument).
		 */
		System.out.println(t.replace("t", "d"));
		
		/*
		 * This is what we refer to as method chaining. We are literally
		 * chaining our methods, calling one after another.
		 */
		System.out.println(t.replace("t", "d").substring(1).concat("dsad"));

		
		
	}
}
