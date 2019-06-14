package com.revature.casting;

class A{
	
	public void doSomethingA() {}
}

class B extends A{
	public void doSomethingB() {}
}

class C extends B{
	public void doSomethingC() {}
}

class D{
	
}

public class Covariance {

	public static void main(String[] args) {

		A a = new B();
//		
//		D d = new D();
//		
//		/*
//		 * The compiler immdiately catches on in this case. It
//		 * knows that you can't cast from type D to B. These two
//		 * classes aren't even remotely related.
//		 */
//		a = (B) d;
		
		/*
		 * The reference a is pointing to an instance of class B.
		 * Class B doesn't have access to the methods on class C,
		 * so when we attempt to cast an object of type B into an
		 * object of type C, we get a ClassCastException at runtime.
		 * Notice that the compiler couldn't catch this before we
		 * ran the application.
		 */
		C c = new C();
		
//		c = (C) a;
		
		///////////////////////////////////////////////////////
		
		/*
		 * The reference type determines which methods you have
		 * access to. In other words, the method defined in class A
		 * are accessible to a reference variable which has a
		 * reference type of A.
		 */
		A d = new C();
			
		B bo = new B();
		
		bo = (B) d; //OKAY
		
		bo = (C) d; //OKAY
		
		C e = new C();
		
		bo = e;
	}
}
