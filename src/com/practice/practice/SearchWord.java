package com.practice.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchWord {
	
	public static void main(String[] args) throws IOException 
    {    
			
		int mBCount = 0;
		
		Scanner s = new Scanner(new FileReader("C:\\Temp\\mytextfile.txt"));
		
		ArrayList<String> words = new ArrayList<String>();
				
		while (s.hasNext()) {
			words.add(s.next());
		}
		
		for(int i = 0; i < words.size(); ++i) {
			
			System.out.println("the word at index " + i + " is " + words.get(i));
			if(words.get(i).contains("Macbeth")) {
				mBCount++;
			}
			
		}
	 
		int wordCount = words.size();
         
         System.out.println("The file contains " + mBCount + " occurrences of \"Macbeth\"");   
   
    }

}
