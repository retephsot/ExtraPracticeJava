package com.practice.practice;

public class STRBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mySTR = "yoRastaMon";
		
		System.out.println(" The reverse of myStr is " + STRBuildReverse(mySTR));

	}
	
	
	public static String STRBuildReverse(String myString) {
		
		String myUpdatedWrd = "";
		
		StringBuilder sb = new StringBuilder(myString);
		
		myUpdatedWrd = sb.reverse().toString();
				
		return myUpdatedWrd;
	}

}
