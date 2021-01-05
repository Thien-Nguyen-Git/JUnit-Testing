package com.junit.helper;

public class Calculator {
	
//	Create a Calculator project using Maven. 
//	Add the following functions in the calculator class: 
//		addNumbers
//		subtractNumbers
//		multiplyNumbers
//		divideNumbers
//		findMod
//
//	Create Junit tests as follows:
//		Separate tests for all the above 5 functions.
//		A single parameterized test for the calculator
//		Test Suite for the Calculator


	public double addNumbers(double inputX, double inputY) {
		return inputX + inputY;
	}

	public double subtractNumbers(double inputX, double inputY) {
		return inputX - inputY;
	}

	public double multiplyNumbers(double inputX, double inputY) {
		return inputX * inputY;
	}

	public double divideNumbers(double inputX, double inputY) {
		return inputX / inputY;
	}

	public double findMod(double inputX, double inputY) {
		return inputX % inputY;
	}

}
