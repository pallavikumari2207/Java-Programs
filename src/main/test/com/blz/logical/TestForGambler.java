package com.blz.logical;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.log.Customizedexception;
import com.blz.utils.logical.UtilsLogical;

public class TestForGambler {

	@Test(expected=Customizedexception.class)
	public void testforexception() throws Customizedexception {
		UtilsLogical.gambler(5,-10, 100, 50);
		
	}
	@Test
	public void test() throws Customizedexception {
		UtilsLogical.gambler(10,1000,2000,200);
		
	}

}
