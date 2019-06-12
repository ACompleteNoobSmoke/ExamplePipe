package com.revature.abstractclasses;

import com.revature.interfaces.Interface;

/*
 * Abstract classes are allowed to have abstract methods, which
 * are methods with no implementations. Note, however, that
 * abstract classes don't have to have any abstract methods. In
 * fact, abstract classes can have all concrete methods.
 */
public abstract class AbstractClass implements Interface{

	public AbstractClass() {
		
	}
	
	public void getSomething() {
		//Logic here
	}
	
	public abstract void abstractMethod();
	
}

class ImplementingClass extends AbstractClass{

	@Override
	public void doStuff() {
		
	}
	
	

	@Override
	public int addStuff() {
		return 0;
	}

	/**
	 * When overriding a method, you must NOT change the method
	 * signature -- only the implementation can change.
	 */
	@Override
	public void abstractMethod() {
		
	}
	
	/*
	 * If you're overloading a method, you may change the signature.
	 * Just be sure that there is no ambiguity, meaning that the
	 * number of parameters or the parameter types actually differ
	 * from the method you're attempting to overload.
	 */
	public int abstractMethod(int a) {
		return 0;
	}
	
//	AbstractClass a = new AbstractClass(); //DOES NOT COMPILE
	
}
