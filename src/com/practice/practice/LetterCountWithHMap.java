package com.practice.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LetterCountWithHMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "aerfrrree11111";
		
		freqCt(myString);

	}
	
	public static void freqCt(String str) {
		
		str = str.replace(" ", "");
		Map frequencyCt = new LinkedHashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			if(frequencyCt.containsKey(ch)) {
				frequencyCt.put(ch, (Integer)
						frequencyCt.get(ch) +1);
			} else {
				frequencyCt.put(ch, 1);
			}
		}
		
		System.out.println(frequencyCt);
	}

}
