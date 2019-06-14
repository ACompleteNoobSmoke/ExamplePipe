package com.revature.lambdas;

/*
 * A lambda expression can be used as if it was an object an
 * executed on demand. It is a function that belongs to no class
 * and lets us treat functionality as a method argument(in other
 * words, we can pass methods into other methods as arguments).
 * This is called functional programming, which entails passing
 * application state exclusively programming.
 */
public class Lambda {

	public boolean isId = true;
	public boolean isName = false;
	public boolean isLambdaClass = true;
	
	public static void main(String[] args) {
		
		Lambda la = new Lambda();
		
		/*
		 * We're storing our Lamdba expressions (which are methods),
		 * in a reference of type FunctionalInterface, which the contains
		 * the single abstract method we defined.
		 */
		FunctionalInterface isIdExp = (Lambda l) -> l.isId;
		FunctionalInterface isNameExp = (Lambda l) -> l.isName;
		FunctionalInterface isLambdaClassExp = (Lambda l) -> l.isLambdaClass;
		
		System.out.println(Lambda.takesALambdaExpression(isIdExp, la));
		System.out.println(Lambda.takesALambdaExpression(isNameExp, la));
		System.out.println(Lambda.takesALambdaExpression(isLambdaClassExp, la));
	}
	
	//Let's create a method that takes a lambda expression as an
	//argument.
	
	public static boolean takesALambdaExpression(FunctionalInterface fi, Lambda a) {
		
		return fi.trueOrFalse(a);
	}
}
