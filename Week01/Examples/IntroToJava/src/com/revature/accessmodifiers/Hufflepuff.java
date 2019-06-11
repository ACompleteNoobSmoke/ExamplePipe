package com.revature.accessmodifiers;

/*
 * There are four access modifiers in Java: private, protected, public,
 * and default. The default access is implied if you don't specify
 * another modifier.
 * 
 * The private modifier specifies that a member may only be accessed
 * from within the class.
 * 
 * The protected modifier specifies that a member may only be accessed
 * from within the class and from within subclasses.
 * 
 * The public modifier specifies that a member may be accessed from
 * anywhere (from within any class, etc.)
 * 
 * The default modifier specifies that a member may only be accessed
 * from within the same package.
 */
public class Hufflepuff {
	private String dormPassword = "let me in"; //private field
	protected String guestPassword = "you can come in too";
	public int numberOfHufflepuffs = 1;
	int numberOfPeopleWhoLikeHufflepuffs = 0;
}

class Luna extends Hufflepuff {
	
	public static void main(String[] args) {
		Luna l = new Luna();
		l.numberOfHufflepuffs = 10;
		l.guestPassword = "dkjdasljfdls";
	}
}
