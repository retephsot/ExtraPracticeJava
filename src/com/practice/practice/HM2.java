package com.practice.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HM2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mhmap.put(6, "i waz");
		mhmap.put(7, "crusing down the streen in my 6 fo");
		mhmap.replace(2, "funky fresh Eazy E");
		
		for(Map.Entry<Integer, String> entry : mhmap.entrySet()) {
			
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +" : " + value);
		}
		
		//to get all entrySet
		for(Map.Entry m:mhmap.entrySet()) {  
		System.out.println("getting all entry set " + m.getKey()+" : "+m.getValue());  
		}
		
		//to get all initial keys
		Set<Integer> mhmapkeys = mhmap.keySet();
		System.out.println("Initial keys  : " + mhmapkeys);
		
		//to get all values
		Collection<String> mhmapvalues = mhmap.values();
		System.out.println("Initial vlaues : " + mhmapvalues);
		
		System.out.println("the key value pair at key 1 is " + 1 + " : " + mhmap.get(1));
		

	}
	
	public static HashMap<Integer, String> mhmap = new HashMap<Integer, String>();
	static {
		
		mhmap.put(1, "whats yo name fool");
		mhmap.put(2, "Eazy E");
		mhmap.put(3, "where you from fool");
		mhmap.put(4, "compton");		
	}


}
