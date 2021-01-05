package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CalParamSub {
	Calculator helper = new Calculator();
	
	private double inputX;
	private double inputY;
	private double output;
	
	public CalParamSub(double inputX, double inputY, double output) {
		super();
		this.inputX = inputX;
		this.inputY = inputY;
		this.output = output;
	}
	
	@Parameters
	public static Collection<Double[]> testConditions() {
		Double output[][] = {
				{3.0, 2.0, 1.0},
				{50.0, 30.0, 20.0}
				};
		return Arrays.asList(output);
	}
	@Test
	public void Subtraction() {
		assertEquals(output, helper.subtractNumbers(inputX,inputY),0);
	}

}
