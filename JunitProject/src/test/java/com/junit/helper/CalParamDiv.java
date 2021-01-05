package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CalParamDiv {
	Calculator helper = new Calculator();
	
	private double inputX;
	private double inputY;
	private double output;
	
	public CalParamDiv(double inputX, double inputY, double output) {
		super();
		this.inputX = inputX;
		this.inputY = inputY;
		this.output = output;
	}
	
	@Parameters
	public static Collection<Double[]> testConditions() {
		Double output[][] = {
				{20.0, 10.0, 2.0},
				{50.0, 25.0, 2.0}
				};
		return Arrays.asList(output);
	}
	@Test
	public void Division() {
		assertEquals(output, helper.divideNumbers(inputX,inputY),0);
	}

}
