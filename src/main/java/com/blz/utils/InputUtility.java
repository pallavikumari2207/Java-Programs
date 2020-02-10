package com.blz.utils;

import java.util.Scanner;

public class InputUtility {
	public static final Scanner scan=new Scanner(System.in);
	public static int intval()
	{
		return scan.nextInt();
	}
	public static float floatval()
	{
		return scan.nextFloat();
	}
	public static double doubleval()
	{
		return scan.nextDouble();
	}
	public static char charval()
	{
		return scan.next().charAt(0);
	}
	public static boolean boolval()
	{
		return scan.nextBoolean();
	}
	public static String stringval()
	{
		return scan.next();
	}
}
