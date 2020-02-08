package com.blz.basic;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import com.blz.log.Customizedexception;
import com.blz.util.Util;

public class TestLeap {

	@Test(expected=Customizedexception.class)
	public void testForException() throws Customizedexception {
		Util.leapyr(123);
	}
	@Test
	public void test() throws Customizedexception {
		assertTrue(Util.leapyr(2020));
	}
}
