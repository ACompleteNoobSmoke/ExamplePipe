package com.revature.interfaces;

/*
 * An interface is by default public and abstract. It declares
 * methods that any class that implements this interface must
 * implement.
 */
public interface Interface {
	/*
	 * Interfaces can have fields, but they must be public, static,
	 * and final.
	 */
	public static final String s = "string";
	
	/*
	 * Methods in interfaces are by default public and abstract.
	 * Abstract methods don't have implementations.
	 * 
	 * Note that methods in an interface cannot be private or final.
	 */
	public abstract void doStuff();
	int addStuff();
	
	/*
	 * All of the methods in an interface don't have to be
	 * abstract. If we use either the "static" keyword or the
	 * "default" keyword, we can give our methods an implementation.
	 */
	
	public static void method1() {}
	
	/*
	 * Classes that implement this interface don't have to 
	 * override this default version of method2. They have the
	 * option to do so, however, if they want to use a different
	 * implementation.
	 */
	public default void method2() {}
}

/*
 * Interfaces can extend other interfaces, but they can't
 * implement other interfaces.
 */

/*
 * MOST IMPORTANTLY: You CANNOT instantiate an interface.
 * 
 * So no using the "new" keyword to instantiate an interface.
 */
interface Interface2 extends Interface{
	
	
}

class ExampleClass{
	
	public static void main(String[] args) {
		
//		Interface i = new Interface(); //DOES NOT COMPILE
	}
}
