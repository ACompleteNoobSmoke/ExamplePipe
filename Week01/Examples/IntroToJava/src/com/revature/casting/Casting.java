package com.revature.casting;

public class Casting {

	public static void main(String[] args) {

		int x = 0;
		long l = 452299999999999999L;
		char c = 'c';
		byte b = 44;
		boolean bool = true;
		
//		boolean newBool = (boolean) x; //You cannot cast other types into boolean values.
		
		
		/*
		 * This is called implicit casting. We don't have to
		 * explicitly tell Java to cast this int as a long, BUT
		 * we can.
		 */
//		l = x;
		
//		l = c;
		
//		x = l; //DOES NOT COMPILE
//		b = l; //DOES NOT COMPILE
		
		/*
		 * This is called explicit casting. We are explicitly telling
		 * Java to cast this long as an int. Note, however, that you
		 * will lose data when casting from a larger data type to
		 * a smaller one, so BE CAREFUL.
		 */
		x = (int) l;
		
		/*
		 * This doesn't print what you'd expect it to...
		 */
		System.out.println(x);
	}
}
