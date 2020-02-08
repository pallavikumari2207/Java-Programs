package com.blz.util;

import java.util.Random;
import java.util.Scanner;

import com.blz.log.Customizedexception;

public class Util {
	public static  boolean leapyr(int year) throws Customizedexception
	{
		boolean flag=false;
		if(year<=1000)
		{
			throw new Customizedexception("entered  mismatch");		
		}
		else
		{
			if(year % 4 == 0)
	        {
	            if( year % 100 == 0)
	            {
	                if ( year % 400 == 0)
	                    flag = true;
	                else
	                    flag= false;
	            }
	            else
	                flag = true;
	        }
	        else
	            flag = false;
		}
	return flag;	
}
	public static String sringreplace(String name)throws Customizedexception
	{	
		String str1="";
		if(name.length()>3)
		{
			String str="Hello <<UserName>> How are you? ";
			 String[] uname = name.split(",");
			 str1=str.replace("<<UserName>>",uname[0]);
		}
	else
	{
		throw new Customizedexception("enter a valid input");
	}
		return str1;
	}
	public static int flipcoin(int n) throws Customizedexception
	{ 
	float percent_head=0;
		if(n>0){
		int headcount = 0;
		int tailcount = 0;
		// System.out.println(x);
		for (int i = 0; i < n; i++) {
			Random rand = new Random();
			float x = rand.nextFloat();
			System.out.println(x);
			if (x < 0.5) {
				headcount++;
			} else {
				tailcount++;
			}
		}
		System.out.println(headcount);
		System.out.println(tailcount);
		 percent_head = (((float) (headcount) / (float) n) * 100);
		System.out.println(percent_head);
		float percent_tail = (((float) (tailcount) / (float) n) * 100);
		System.out.println(percent_tail);
		//return (int) percent_head;
	}
		else
		{
			throw new Customizedexception("n should be positive integer");
		}
		return (int) percent_head;
	}
	public static float harmonic(int n) throws Customizedexception
	{   float res=(float) 1.0;
		if(n>0)
	{
		for(int i=2;i<=n;i++)
		{    
			res=res +(float) ((float)1/(float)i);
		}
			System.out.println(res);	
	}
		else
		{
			throw new Customizedexception("n should be positive integer");
		}
		return res;}
}
