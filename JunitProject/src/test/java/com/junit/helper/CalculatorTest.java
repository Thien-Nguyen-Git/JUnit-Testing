package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator calc = new Calculator();

	@Test
	public void additionTest() {
//		double actual = helper.addNumbers(65, 15);
//		double expected = 80;
//		assertEquals(expected, actual, 0);
		assertEquals(80, calc.addNumbers(65, 15), 0);
	}
	@Test
	public void subtractionTest() {
		assertEquals(50, calc.subtractNumbers(65, 15), 0);
	}
	@Test
	public void multiplicationTest() {
		assertEquals(975, calc.multiplyNumbers(65, 15), 0);
	}
	@Test
	public void divisionTest() {
		assertEquals(4, calc.divideNumbers(60, 15), 0);
	}
	@Test
	public void modulusTest() {
		assertEquals(5, calc.findMod(65, 15), 0);
	}

}
