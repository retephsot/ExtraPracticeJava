package com.practice.practice;

import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthStyle;

public class HM3 {
	
public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "my addidas");
		hmap.put(2, "fresh");
		hmap.put(3, "yo");
		
		//to get value from key 1
		System.out.println(hmap.get(1));
		
		//to get all keys and values from map
		for(Map.Entry<Integer, String> entry : hmap.entrySet()) {
			
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +" : " + value);
		}
		
		//to get all key=value
		for(Map.Entry kv : hmap.entrySet()) {
			
			System.out.println(kv);
			
		}
		
		//to get all keys 
		for(int i : hmap.keySet()) {
			System.out.println(i);
		}
		
		
		/*
		 *  create map of DriftParts
		 */
		//creating dmap hashmap
		HashMap<Integer, DriftParts> dmap = new HashMap<Integer, DriftParts>();
		// create DriftParts
		DriftParts d1 = new DriftParts(1, "rollcenteradjuster", "gives 60degree of steering angle", "gktech", "$200", 10 );
		DriftParts d2 = new DriftParts(2, "coilovers", "gives suspension adjustability", "Tein", "$1200", 5 );
		DriftParts d3 = new DriftParts(3, "LSD", "locks power to both wheels", "Kaaz", "$1200", 4 );
		
		//add DriftParts objects to dmap
		
		dmap.put(1, d1);
		dmap.put(2, d2);
		dmap.put(3, d3);
		
		//test the map
		for(Map.Entry<Integer, DriftParts> entry:dmap.entrySet()) {
			
			int key = entry.getKey();
			DriftParts dp = entry.getValue();
			System.out.println(key + " Details: ");
			System.out.println(dp.id + " " + dp.name + " " + dp.description + " " + dp.maker + " " + dp.price + " " + dp.quantity);
			
		}
		
	}

}
