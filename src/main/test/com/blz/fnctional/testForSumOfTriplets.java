package com.blz.fnctional;

import org.junit.Test;

import com.blz.log.Customizedexception;
import com.blz.utils.Util;

public class testForSumOfTriplets {

	@Test(expected=Customizedexception.class)
	public void testforexception() throws Customizedexception {
		int[] a= {6,7};
		Util.findTriplets(a);	
	}
	@Test
	public void testForTrueCase() throws Customizedexception
	{
	int[] a= {0,-1,2,-3,1};
	Util.findTriplets(a);
	}
}
