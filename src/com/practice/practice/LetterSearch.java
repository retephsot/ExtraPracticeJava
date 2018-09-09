package com.practice.practice;

import java.util.ArrayList;

public class LetterSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String werd = "Syn Lee";
		int length = 0;
		ArrayList<Character> chars = new ArrayList<Character>();
		
		for( char c : werd.toCharArray()) {
			
			chars.add(c);
		}
		
		for(int i =0; i < chars.size(); i++) {
			
			System.out.println("the value of lSearch array list at index " + i + " is " + chars.get(i));
			
		}
		
		

	}

}
