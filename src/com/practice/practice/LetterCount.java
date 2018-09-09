package com.practice.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class LetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Original RuuuuudeBwooooooooy";
		
		 char[] array = str.toCharArray();
		    Set<Character> maxChars = new LinkedHashSet<Character>();

		    int maxCount = 1;
		    maxChars.add(array[0]);

		    for(int i = 0, j = 0; i < str.length() - 1; i = j){
		        int count = 1;
		        while (++j < str.length() && array[i] == array[j]) {
		            count++;
		        }
		        if (count > maxCount) {
		            maxCount = count;
		            maxChars.clear();
		            maxChars.add(array[i]);
		        } else if (count == maxCount) {
		            maxChars.add(array[i]);
		        }
		    }
		    
		    System.out.println(maxChars + " = " + maxCount);

	}

}
