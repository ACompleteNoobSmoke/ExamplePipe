package com.revature.nonaccessmodifiers;

public class NonAccessModifers {

/*
 * There are several non-access modifiers in Java. These include	
 * 
 * static: This creates a class member, which means we don't need
 * an instance of the class to access this member;
 * 
 * final: This creates a "constant", meaning that our reference
 * can't ever point to any other object.
 * 
 * volatile: This specifies that a variable can be only accessed
 * from main memory; it is used in multi-threaded environments.
 * 
 * transient: This specifies that we don't want the field to be
 * serialized.
 * 
 * synchronized: This is used for methods. It specifies that only
 * one thread at a time can access the method.
 * 
 * strictfp: Used for restricting floating-point calculations 
 * and ensuring that we get the same result on every platform 
 * while performing operations using the floating-point variable
 * 
 * native: The native keyword is applied to a method to indicate 
 * that the method is implemented in native code (read: in another
 * programming language)
 *
 *abstract: Allows us to declare an interface, class, or method as 
 *“abstract”; abstract methods don’t have to provide implementations 
 *whereas abstract classes can’t be instantiated and can contain 
 *abstract methods
 */
	public static int num;
	public final String s = "";
	public volatile String v;
	public transient String x = "";
	
	{
		System.out.println("This is valid. It's called an" +
				" instance initializer");
	}
	
	public synchronized void method() {
		
	}
	
	public static void main(String[] args) {
		NonAccessModifers nm = new NonAccessModifers();
		nm.num++;
		
		NonAccessModifers.num++;
		
		System.out.print(NonAccessModifers.num);
		
		
//		nm.s = "string"; //does not compile
	}
}
