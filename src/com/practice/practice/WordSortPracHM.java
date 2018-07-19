package com.practice.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordSortPracHM {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String myWord = "";
		String wordGreater4 = "";
		int counter = 0;
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		ArrayList<String> wordSearch = new ArrayList<String>();
		
		Scanner scan = new Scanner(new FileReader("C:\\Temp\\macbeth.txt"));
		
		
		while(scan.hasNext()) {
			wordSearch.add(scan.next());
		}
		
		for(int i = 0; i < wordSearch.size(); i++) {
			wordSearch.set(i, wordSearch.get(i).toLowerCase());
			wordSearch.set(i, wordSearch.get(i).replaceAll("[ .',;:!?(){}]", ""));
			if(wordSearch.get(i).length() < 5) {
				wordSearch.remove(i);
			}
		}
		
			
		
		for(String werd : wordSearch) {
			
			if (wordCount.containsKey(werd)) {
				
				wordCount.put(werd, wordCount.get(werd)+1);
			}
			else {
				wordCount.put(werd, 1);
			}
		}
		
		
		
		List<Map.Entry<String, Integer>> sortedCount = new ArrayList<Map.Entry<String, Integer>>(wordCount.entrySet());
		
		Collections.sort(sortedCount, new Comparator<Map.Entry<String, Integer>>() {
			
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer>b) {
				return b.getValue().compareTo(a.getValue());
			}
			
		});
		
		for(String word : wordCount.keySet()) {
			System.out.println(word + ": " + wordCount.get(word));
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		for(int i =0; i<sortedCount.size(); i++) {
			Map.Entry<String, Integer> wordCounts = sortedCount.get(i);
			System.out.println(wordCounts.getKey() + ": " + wordCounts.getValue());
		}
		
		System.out.println("the most repeated work is :" + sortedCount.get(2));
	
	}

}
