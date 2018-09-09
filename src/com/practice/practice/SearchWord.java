package com.practice.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SearchWord {
	
	public static void main(String[] args) throws IOException 
    {    
		
		Map<String, Integer> wordCounts = new HashMap<String, Integer>();
		
		int tempCount = 0;
		int mBCount = 0;
		String foundWord = "yo";
		
		//.useDelimiter("[',.:;()?!\" \" \"]");
		Scanner scan = new Scanner(new FileReader("C:\\Temp\\macbeth.txt"));

		
		ArrayList<String> words = new ArrayList<String>();
				
		while (scan.hasNext()) {
			words.add(scan.next());
		}
		
		ArrayList<String> words2 = new ArrayList<String>();
		
		for(int i = 0; i < words.size(); ++i) {
			
			String newWord = words.get(i).replaceAll("[',.:;()?!\"]", "");
			newWord = newWord.toLowerCase();
			
			if (newWord.length() >= 5) {
				words2.add(newWord);
			}
			
		}
		
/*		for(int i = 0; i < words.size(); ++i) {
			
			System.out.println("the word at index " + i + " is " + words.get(i));
			if(words.get(i).equalsIgnoreCase("macbeth")) {
				mBCount++;
			}
			
		}  */
		
		for(int i = 0; i < words.size(); ++i) {
			
			if(words.get(i).isEmpty() || words.get(i).length()<=4) {
				words.remove(i);
			}
		}
		
		for(int i = 0; i < words.size(); ++i) {
			
//			int tempCount = 0;
			System.out.println("the word at index " + i + " is " + words.get(i));
			
			
			for(int j = 0; j< words.size(); ++j) {
				int myCount = 0;
				if(words.get(i).equals(words.get(j))) {
					
					myCount++;	
					
					System.out.println("the value of myCount is now" + myCount);																					
				}	
				
				if(myCount > tempCount) {
					
					tempCount = myCount;
					foundWord = words.get(i);
				}
				
				
				
			}
			
			
		}
		System.out.println("The total arraylist count now is " + words.size());
	 
		for(String word : words2) {
			
			if(wordCounts.containsKey(word))
				wordCounts.put(word, wordCounts.get(word)+1);
			else
				wordCounts.put(word, 1);
		}
		
		List<Map.Entry<String, Integer>> sortedCounts = new ArrayList<Map.Entry<String, Integer>>(wordCounts.entrySet());
		Collections.sort(sortedCounts, new Comparator<Map.Entry<String,Integer>>() {
			
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return b.getValue().compareTo(a.getValue());
			}
		});
		
		for(String word : wordCounts.keySet()) {
			System.out.println(word + ": " + wordCounts.get(word));
		}
         
        System.out.println("----------------------------------------------------------");
        
        for(int i = 0; i < sortedCounts.size(); i++) {
        	
        	Map.Entry<String, Integer> wordCount = sortedCounts.get(i);
        	System.out.println(wordCount.getKey() + ": " + wordCount.getValue());
        }
        
        System.out.println("The most occuring word is " + sortedCounts.get(0));
        
        System.out.println("The sec most occuring word is " + sortedCounts.get(1));


    }

}
