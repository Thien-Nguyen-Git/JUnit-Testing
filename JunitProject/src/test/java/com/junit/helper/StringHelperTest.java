package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper(); //create an instance of StringHelper method
		
	@Test
	public void truncateAInFirst2Positions_1() {
//		String actual = helper.truncateAInFirst2Positions("AACD");
//		String expected = "CD";
//		assertEquals(expected, actual);	
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void truncateAInFirst2Positions_2() {
//		String actual = helper.truncateAInFirst2Positions("ACD");
//		String expected = "CD";
//		assertEquals(expected, actual);	
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	//ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void areFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
//		boolean expected = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
//		assertFalse(expected);
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
//		boolean expected = helper.areFirstAndLastTwoCharactersTheSame("ABAB");
//		assertTrue(expected);
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_SmallerBasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_SmallerBasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
