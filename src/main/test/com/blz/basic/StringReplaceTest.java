package com.blz.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.blz.log.Customizedexception;
import com.blz.utils.Util;

public class StringReplaceTest {
	@Test
public void stringtest() throws Customizedexception
{
	String actual=Util.sringreplace("pallavi");
	String expected="Hello pallavi How are you? " ;
	assertEquals(expected,actual);
}
}
