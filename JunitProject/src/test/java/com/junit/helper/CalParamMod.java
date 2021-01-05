package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CalParamMod {
	Calculator helper = new Calculator();
	
	private double inputX;
	private double inputY;
	private double output;
	
	public CalParamMod(double inputX, double inputY, double output) {
		super();
		this.inputX = inputX;
		this.inputY = inputY;
		this.output = output;
	}
	
	@Parameters
	public static Collection<Double[]> testConditions() {
		Double output[][] = {
				{20.0, 10.0, 0.0},
				{50.0, 25.0, 0.0}
				};
		return Arrays.asList(output);
	}
	@Test
	public void Remainder() {
		assertEquals(output, helper.findMod(inputX,inputY),0);
	}

}
