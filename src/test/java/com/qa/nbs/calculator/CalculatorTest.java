package com.qa.nbs.calculator;

import org.junit.*;

public class CalculatorTest {

	@Test
	public void addTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 2);

		Assert.assertEquals(4, result);
	}
}