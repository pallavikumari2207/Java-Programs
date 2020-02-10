package com.blz.basic;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.log.Customizedexception;
import com.blz.utils.Util;

public class TestPower2 {

	@Test(expected=Customizedexception.class)
	public void testofException() throws Customizedexception {
		Util.powerfunc(-1);
		
	}
	@Test
	public void test() throws Customizedexception {
		int[] expected= {1,2,4,8};
		int[] actual=Util.powerfunc(4);
		assertArrayEquals(expected, actual);
	}
	

}
