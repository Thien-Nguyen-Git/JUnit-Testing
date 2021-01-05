package com.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
//		ArraysCompareTest.class, 
//		BeforeAfterTest.class, 
//		ParameterizedTest.class, 
//		StringHelperTest.class, 
		CalculatorTest.class, 
//		CalculatorParameterizedTest.class 
		CalParamAdd.class,
		CalParamSub.class,
		CalParamMul.class,
		CalParamDiv.class,
		CalParamMod.class
	})
public class AllTests {

}