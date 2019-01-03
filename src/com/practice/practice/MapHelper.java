package com.practice.practice;

import java.util.Map;

public class MapHelper {
	
public void printKeyVal(Map<Integer, String> myMap) {
		
		for (Map.Entry<Integer, String> entry : myMap.entrySet()) {

			System.out.println("key value set " + entry.getKey() + ":  " + entry.getKey() + " - " + entry.getValue());

		}
	}

}
