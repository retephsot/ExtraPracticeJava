package com.practice.practice;

import java.util.Scanner;

public class SortLettersInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char temp;
		String sortedString = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a string");
		//String str = scan.next();
		String str = scan.nextLine();
		scan.close(); 
		
		//will work without this
		str.replaceAll("\\s+", "");

		char[] chArray = str.toCharArray();

		for (int i = 0; i < chArray.length; i++) {

			for (int j = 0; j < chArray.length; j++) {

				if (chArray[i] < chArray[j]) {
					temp = chArray[i];
					chArray[i] = chArray[j];
					chArray[j] = temp;

				}
			}

		}

		for (int k = 0; k < chArray.length; k++) {

			sortedString = sortedString + chArray[k];

		}

		System.out.println("The sorted string is " + sortedString);

	}

}
