package com.coder.converter;

import static org.junit.Assert.*;  
import org.junit.Test;  

public class NumberToWordsConverterTest {
	
	@Test
	public void testConverter(){
		assertEquals(NumberToWordsConverter.convert(-7845),"minus seven thousand eight hundred and forty five");
		assertEquals(NumberToWordsConverter.convert(0),"zero");
		assertEquals(NumberToWordsConverter.convert(1),"one");
		assertEquals(NumberToWordsConverter.convert(21),"twenty one");
		assertEquals(NumberToWordsConverter.convert(105),"one hundred and five");
		assertEquals(NumberToWordsConverter.convert(56945781),"fifty six million nine hundred and forty five thousand seven hundred and eighty one");
		assertEquals(NumberToWordsConverter.convert(1000000001),"Please pick a number below 1000000000");
	}

}
