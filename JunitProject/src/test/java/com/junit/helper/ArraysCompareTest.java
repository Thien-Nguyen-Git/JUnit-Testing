package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	// Arrays.sort
	@Test
	public void testArraySort() {
		int[] numbers = {40,20,10,30};
		int[] expected = {10,20,30,40};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	//Null Pointer Exception
	@Test(expected=NullPointerException.class)
	public void testArraySort_null() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout=1000) // in millisconds
	public void testArraySort_Performance() {
		int array[] = {40,20,10,30};
		for(int i=1;i<=1000000;i++)
		{
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
