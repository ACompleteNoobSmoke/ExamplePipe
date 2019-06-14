package com.revature.lambdas;

/*
 * A functional interface is an interface that has one AND ONLY
 * ONE abstract method. It may contain other methods, but those
 * methods must be concrete (e.g. must have implementations).
 * 
 * Functional interfaces are used in conjunction with lambda
 * expressions.
 */

/*
 * A marker interface is an interface with no methods.
 */
public interface FunctionalInterface {

	public abstract boolean trueOrFalse(Lambda la);
}
