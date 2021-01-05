package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterizedTest {
	StringHelper helper = new StringHelper(); //create an instance of StringHelper method
	
	private String input;
	private String expectedOutput;
	// generate constructors using fields
	public ParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][]={{"AACD", "CD"},
			{"ACD", "CD"}};
			return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void truncateAInFirst2Positions_1() {		
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));	
	}
	@Test
	public void truncateAInFirst2Positions_2() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
}
