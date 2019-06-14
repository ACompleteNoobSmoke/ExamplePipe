package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.revature.calculator.Calculator;

/*
 * JUnit has many assert methods. Some of the most commonly used ones
 * include:
 * 
 * -assertNotNull
 * -assertNull
 * -assertFalse
 * -assertTrue
 * -assertEquals
 */
public class CalculatorTest {

	Calculator c;
	/*
	 * The BeforeClass annotation denotes that a method will run
	 * once -- when this class is instantiated. We'll typically
	 * use this to perform some setup for our test suite.
	 */
	@BeforeClass
	public void setUp() {
		c = new Calculator();
	}
	
	/*
	 * Methods that are annotated with @Before are executed
	 * once before each individual test case.
	 */
	@Before
	public void beforeEachTest() {
		
	}
	
	/*
	 * This annotation denotes that this method is a JUnit test.
	 */
	@Test
	public void testInstantiation() {
//		Calculator c = new Calculator();
//		assertNotNull(c);
		
		assertTrue(true);
	}
	
	/*
	 * This annotation specifies that the framework should ignore
	 * this test.
	 */
	@Ignore
	@Test
	public void testNull() {
		Calculator c = null;
		assertNull(c);
	}
	
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(c.add(2, 2), 4);
	}
	
	@Test
	public void testSubtract() {
		Calculator c = new Calculator();
		assertEquals(c.subtract(4, 1), 3);
	}
	
	/*
	 * Methods annotated with the @After annotation are executed
	 * after each individual test.
	 */
	
	@After
	public void afterEachTest() {
		
	}
	
	/*
	 * The AfterClass annotation denotes that this method will only
	 * run once -- after all of our tests have been run.
	 */
	@AfterClass
	public void tearDown() {
		
	}
}
