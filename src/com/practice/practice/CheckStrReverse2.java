package com.practice.practice;

import java.util.Scanner;

public class CheckStrReverse2 {
	
	public static String compStr;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean myResults = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("input your string");
		compStr = scan.nextLine();
		
		myResults = ckStrReverse(compStr);
		if(myResults == true) {
			System.out.println("The reverse of the input string equals the original string!!");
		}
		else {
			System.out.println("The reverse of the input string does not equal the original string");
		}

	}
	
	public static boolean ckStrReverse(String myStr) {
		
		String revWord = "";
		boolean results = false;
		
		for(int i = myStr.length()-1; i >=0; i--) {
			
			revWord += myStr.charAt(i);
		}
		System.out.println("The reverse of the input string is now " + revWord);
		if (revWord.equals(myStr)) {
			results = true;
		}
		return results;
	}

}
