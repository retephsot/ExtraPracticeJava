package com.practice.practice;

import java.util.HashMap;
import java.util.Map;

public class HM1 {

	public static void main(String[] args) {
		
		MapHelper mh = new MapHelper();
		NWAHMap nwaMap = new NWAHMap();

		HashMap<Integer, String> oleE = new HashMap<Integer, String>();

		oleE.put(1, "crusing down the street in my 6 4");
		oleE.put(2, "jocking da bi, slappin they h");
		oleE.put(3, "went to da park to get to school");
		oleE.put(4, "knuckle head out there co shooting some hoops");
		oleE.put(6, "whats yo name fool");
		oleE.put(7, "funky fresh easy e");
		
		
		nwaMap.getDreMap().put(1, "yo dre lets kick it on the one");
		nwaMap.getDreMap().put(2, "and we don't stop");
		nwaMap.getDreMap().put(3, "makin record, the people co checkin and respectin it");
		nwaMap.getDreMap().put(4, "cus it rocks the sells won't stop");

		System.out.println("the key for value whats yo name fool is " + getKey("whats yo name fool", oleE));

		for (Map.Entry<Integer, String> entry : oleE.entrySet()) {

			int i = entry.getKey();
			String value = entry.getValue();
			System.out.println("key and value for oleE consists of " + i + " : " + value);

		}

		System.out.println("Alternative way to get key value set is ---------------------");
		mh.printKeyVal(oleE);

		for (Map.Entry<Integer, String> ent : oleE.entrySet()) {
			if (ent.getValue().equals("whats yo name fool")) {
				ent.setValue("What is your name sir?");
			}
		}

		System.out.println("now the key value set consists of the following ---------- ");

		mh.printKeyVal(oleE);
		
		System.out.println(" printing out key val pairs for nwaHMap ---------------");
		
		mh.printKeyVal(nwaMap.getDreMap());

	}
	
	

	public static int getKey(String val, Map<Integer, String> myMap) {

		int keyVal = 0;

		for (Map.Entry ent : myMap.entrySet()) {
			if (ent.getValue().equals(val)) {
				System.out.println("The key val you want is " + ent.getKey());
				keyVal = (int) ent.getKey();
			}
		}

		return keyVal;
	}
					
}
