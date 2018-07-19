package com.practice.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchWord {
	
	public static void main(String[] args) throws IOException 
    {    
		int tempCount = 0;
		int mBCount = 0;
		String foundWord = "yo";
		
		Scanner s = new Scanner(new FileReader("C:\\Temp\\macbeth.txt"));
		
		ArrayList<String> words = new ArrayList<String>();
				
		while (s.hasNext()) {
			words.add(s.next());
		}
		
		
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
	 
		int wordCount = words.size();
         
         System.out.println("The file contains " + tempCount + " occurrences of " + foundWord);   
   
    }

}
