package com.training.pms.junit_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator = new Calculator();
	@Test //hover over this and at the bottom shows the two most important factors to @Test
	void testAdd() {
		int expected = 20;
		int actual = calculator.add(10,  10);
		assertEquals(expected, actual); // this test will only pass if expected and actual are the same
	}

	@Test
	void testAdd2() {
		int expected = 20;
		int actual = calculator.add(12, 8);
		assertEquals(expected,actual);
	}

	@Test
	void testAdd3() {
		int expected = 20;
		int actual = calculator.add(20, 0);
		assertEquals(expected, actual);
	}
	
//	@Test
//	void testDiv() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testIsEvenOdd() {
//		fail("Not yet implemented");
//	}

}
