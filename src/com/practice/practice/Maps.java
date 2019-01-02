package com.practice.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> ColMap = new HashMap<Integer, String>();
		TreeMap<Integer, String> OthMap = new TreeMap<Integer, String>();
		HashMap<Integer, String> NColMap = new HashMap<Integer, String>();
		TreeMap<Integer, String> NTreeMap = new TreeMap<Integer, String>();
		
		ColMap.put(1, "my adidas");
		ColMap.put(3, "compton");
		OthMap.put(2, "Whats yo name fool");
		OthMap.put(5, "funky fresh easy e");
		
		for( Map.Entry ent : ColMap.entrySet()) {
			System.out.println("the key value set at " + ent.getKey() + " is " + ent.getKey() + " - " + ent.getValue());
		}
		ColMap.putAll(OthMap);
		
		NTreeMap.putAll(ColMap);
		
		System.out.println("now the contents of ColMap after putAll is ");
		for( Map.Entry ent : ColMap.entrySet()) {
			
			System.out.println("the key value set at " + ent.getKey() + " is " + ent.getKey() + " - " + ent.getValue());
		}
		
		System.out.println(" now lets reverse the value content of TreeMap OthMap ---------------------------");
		
		NColMap.putAll(OthMap.descendingMap());
		
		System.out.println("The key value pair for the new HashMap NColMap is " );
		for(Map.Entry entry : NColMap.entrySet()) {
			System.out.println("The key value set at key " + entry.getKey() + " is " + entry.getKey() + " - " + entry.getValue());
		}
		
	}

}
