package com.revature.exceptions;

/*
 * In order to create an exception, we extend the Exception class.
 * Note that any class which extends the Exception class but NOT the
 * RuntimeException class is a checked exception, which means it
 * MUST be handled.
 */
public class UnforgivableCurseException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public UnforgivableCurseException() {
		/*
		 * Here we have called the parent class' (Exception)
		 * constructor, which takes a message in the form of
		 * a string.
		 */
		super("Curse is unforgivable!");
	}

}
