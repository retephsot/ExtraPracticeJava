package com.practice.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("rude");
		a1.add("bwoy");
		a1.add("wah");
		a1.add("gwan");
		a1.add("irie");
		
		int i = 0;
		for(String ele:a1) {			
			System.out.println("The value at index at " + i + " is " + ele);
			++i;
		}
		
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			
			if(s.equals("irie")) {
				itr.remove();
			}
		}
		
		System.out.println("the contents of array list a1 now inclues the following -----------");
		System.out.println(a1);

	}

}
