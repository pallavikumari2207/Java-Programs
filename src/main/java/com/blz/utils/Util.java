package com.blz.utils;

import java.util.Random;
import java.util.Scanner;

import com.blz.log.Customizedexception;

public class Util {
	public static boolean leapyr(int year) throws Customizedexception {
		boolean flag = false;
		if (year <= 1000) {
			throw new Customizedexception("entered  mismatch");
		} else {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0)
						flag = true;
					else
						flag = false;
				} else
					flag = true;
			} else
				flag = false;
		}
		return flag;
	}

	public static String sringreplace(String name) throws Customizedexception {
		String str1 = "";
		if (name.length() > 3) {
			String str = "Hello <<UserName>> How are you? ";
			String[] uname = name.split(" ");
			str1 = str.replace("<<UserName>>", uname[0]);
		} else {
			throw new Customizedexception("enter a valid input");
		}
		return str1;
	}

	public static int flipcoin(int n) throws Customizedexception {
		float percent_head = 0;
		if (n > 0) {
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
			// return (int) percent_head;
		} else {
			throw new Customizedexception("n should be positive integer");
		}
		return (int) percent_head;
	}

	public static float harmonic(int n) throws Customizedexception {
		float res = (float) 1.0;
		if (n > 0) {
			for (int i = 2; i <= n; i++) {
				res = res + (float) (1f / (float) i);
			}
			System.out.println(res);
		} else {
			throw new Customizedexception("n should be positive integer");
		}
		return res;
	}

	public static int[] powerfunc(int num) throws Customizedexception {
		int[] res = new int[num];
		if (num > 0 && num < 31) {
			for (int i = 0; i < num; i++) {
				res[i] = (int) Math.pow(2, i);
			}
			return res;
		} 
		else {
			throw new Customizedexception("n should be positive integer");
		}
	}
	public static boolean findTriplets(int[] a) throws Customizedexception {
		boolean found=false;
		int n=a.length;
		if(n>3)
		{
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					
					if (a[i] + a[j] + a[k] == 0) {
						System.out.print(a[i]); 
	                    System.out.print(" "); 
	                    System.out.print(a[j]); 
	                    System.out.print(" "); 
	                    System.out.print(a[k]); 
	                    System.out.print("\n");

						found = true;
						
					}
				}
			}
		}
		}
		else {
			throw new Customizedexception("n should be minimum of three");
		}
		//System.out.println("found is:"+found);
		return found;
			
		}
}
