package com.practice.practice;


public class reversableStrings {

	public static int length;
	//The test string
	public static String str = "radar";
	public static String results;
	public static boolean endResults;
	
	public static void main(String[] args) {
		
		endResults = inspectString(str);
		System.out.println("The result is " + endResults);
	}
		
	public static boolean inspectString(String str)
	{
		results = "";
		length = str.length();
		
		for(int i = length; i>0; i--)
		{
			results += str.charAt(i-1);
		}
		
		System.out.println("The string value reversed is " + results);
		
		if (results.equals(str))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}