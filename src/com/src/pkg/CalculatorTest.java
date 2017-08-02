package com.src.pkg;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {


	@Test
	public void testAddTwoPositiveIntegers() {
		int expected = 11;
		int actual = new Calculator().add(4, 7);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddTwoNegativeIntegers() {
		int expected = -11;
		int actual = new Calculator().add(-4, -7);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddNegativeIntegerToPositiveInteger() {
		int expected = -3;
		int actual = new Calculator().add(4, -7);
		assertEquals(expected, actual);
	}
	

}
