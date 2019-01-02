package com.practice.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyNewHMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> strMp1 = new HashMap<String, String>();
		Map<Integer, String> treeMp1 = new TreeMap<Integer, String>();
		
		treeMp1.put(1, "wassup");
		treeMp1.put(2, "yo Mamma");
		treeMp1.put(3, "werd");
		treeMp1.put(4, "nuh");
		
		strMp1.put("browser", "chrome");
		strMp1.put("color", "red");
		strMp1.put("pizza", "cheese");
		strMp1.put("car", "s15 silvia");
		
		for(Map.Entry ent:strMp1.entrySet()) {
			if(ent.getKey().equals("car")) {
				System.out.println("The value is " + ent.getValue());
			}
		}
		
		System.out.println("printing out all key value pairs from strMp1");
		
		for(Map.Entry strMpEntry:strMp1.entrySet()) {
			System.out.println(strMpEntry.getKey() + " -> " + strMpEntry.getValue());
		}
		
		HashMap<Integer, Object> myObjMap = new HashMap<Integer, Object>();
		for(Map.Entry ent:strMp1.entrySet()) {
			int i = 1;
			if ((ent.getKey().equals("car")) || (ent.getKey().equals("pizza"))) {
				
				myObjMap.put(i, ent.setValue(strMp1));
				
			}
			++i;
		}
		
		System.out.println("the value of myObjMap is " + myObjMap);

	}

}
