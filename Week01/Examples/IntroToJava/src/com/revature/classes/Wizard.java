package com.revature.classes;

import com.revature.exceptions.UnforgivableCurseException;

/*
 * You can only have up to one public class per file, and if you
 * have a public class, that class' name must match the file name.
 * 
 * A class serves as a blueprint for an object. When we create an
 * object using a class' blueprint, that object is an instance of
 * the class.
 */

public class Wizard {
	
	/*
	 * A class will typically have fields as well. These are
	 * properties of our objects.
	 */
	
	private boolean hasMagic = true;
	private String name;
	
	/*
	 * This is how we create a constructor. Once we specify a 
	 * constructor, there is no longer a default constructor.
	 * Notice that constructors don't have return types. The
	 * name of your constructor must match the name of your class.
	 */
	public Wizard(String name) {
	}

	/*
	 * Java provides each class with what we refer to as a "default
	 * constructor". However, it only does so if we don't create a
	 * constructor.
	 * 
	 * NOTE: A constructor provides information about how an object
	 * should be created.
	 */
	
	/*
	 * This is a method (or member function). It performs some logic
	 * that we specify. Every method must have a return type. Some
	 * valid return types include:
	 * -void (this means that the method returns nothing to the caller)
	 * -any object (e.g. Object, String, Wizard, etc.)
	 * -primitives(int, double, float, etc.)
	 */
	
	/*
	 * If there is a possibility of an exception being thrown,
	 * we must specify this in the method signature.
	 */
	public void castSpell() throws UnforgivableCurseException {
		System.out.println("Avada Kedavra");
		/*
		 * Here we are throwing a new UnforgivableCurseException.
		 * Note the difference between the "throws" and the "throw"
		 * keyword.
		 */
		throw new UnforgivableCurseException();
	}
	
	public void castAnotherSpell() throws RuntimeException {
		System.out.println("This doesn't have to be handled.");
	}
	
	public static void main(String[] args) {
		//w is an instance of the Wizard class
		
		/*
		 * This is how we create an object in Java. The "w" is
		 * our variable name (and reference). The "new" keyword
		 * is what actually tells Java to allocate memory for this
		 * new instance of wizard.
		 */
		Wizard w = new Wizard("Harry");
		
		w.castAnotherSpell();
		
		//This instance of the Wizard class has access to its
		//member variables and methods.
		
		/*
		 * This is what we call a try-catch block. We use this to
		 * handle exceptions so that our code can resume execution.
		 * Note that you must catch exceptions from the most specific
		 * to the least specific. If you don't, you'll have unreachable
		 * code.
		 * 
		 * We can optionally include a finally block. This block will
		 * always execute unless one of two things happens:
		 * 	1). Some unrecoverable error occurs.
		 *  2). You invoke System.exit(0);
		 */
		try {
		w.castSpell();
		}catch(UnforgivableCurseException e) {
			e.printStackTrace();
			try {
				throw new Exception();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("This always executes.");
		}
	}
}

