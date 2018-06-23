package com.practice.practice;

import java.util.HashMap;
import java.util.Map;

public class HM1 {

	public static void main(String[] args) {
		
		oleE.put(6, "whats yo name fool");
		oleE.put(7, "funky fresh easy e");
		
		for(Map.Entry<Integer, String> entry : oleE.entrySet()) {
			
			int i = entry.getKey();
			String value = entry.getValue();
			System.out.println("key and value for oleE consists of " + i + " : " + value);
			
		}

	}
	
	
	public static HashMap<Integer, String> oleE = new HashMap<Integer, String>();
	static {
		
		oleE.put(1, "crusing down the street in my 6 4");
		oleE.put(2, "jocking da bi, slappin they h");
		oleE.put(3, "went to da park to get to school");
		oleE.put(4, "knuckle head out there co shooting some hoops");
	}

}
