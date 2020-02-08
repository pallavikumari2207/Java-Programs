package com.blz.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.blz.log.Customizedexception;
import com.blz.util.Util;

public class harmonic_test {
	@Test
	public void harmonicTest() throws Customizedexception
	{
		float expected=(float) 2.0833335;
		float actual=(float)Util.harmonic(4);
		assertEquals(expected, actual);
		
	}

}
