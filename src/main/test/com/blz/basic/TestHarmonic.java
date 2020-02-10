package com.blz.basic;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.log.Customizedexception;
import com.blz.utils.Util;

public class TestHarmonic {

	@Test(expected=Customizedexception.class)
	public void testforexception() throws Customizedexception {
		Util.harmonic(-5);
	}
   @Test
	   public void test() throws Customizedexception {
		   assertEquals(2.08333,Util.harmonic(4),Math.E);
	   }
   
}
