package com.practice.practice;

public class CreateNewIntegerPractice {
		
		public static int a = 2467;
		public static int b = 345;
		public static String results;
		public static int resultInt2;
		public static int resultInt;
		public static int length;
		
		
		

		public static void main(String[] args) {

		// Start Here
			String aSTR = String.valueOf(a);
			String bSTR = String.valueOf(b);				
			
			resultInt2 = createString(aSTR, bSTR);
			
			System.out.println("The int value of resultInt2 is " + resultInt2);
			
			
		}
		
			public static int createString(String aSTR, String bSTR)
			{
				length = (aSTR.length() + bSTR.length());
							
				System.out.println("the total length is " + length);
				
				if (aSTR.length() + bSTR.length() > 9)
				{
					
					System.out.println("need to return -1, the length is too long");
					return -1;
				}
				
				if (aSTR.length() + bSTR.length() <= 9)
				{
					
					int x = 0;
					
					int maxLength = aSTR.length();
					if (bSTR.length() > maxLength) {
						maxLength = bSTR.length();
					}
					
					results = "";
					
					for ( x = 0; x < maxLength; x++)
					//do
					{
				
						if (x < aSTR.length()) {
							results += aSTR.charAt(x);
							//To test the existing string characters
							//System.out.println("the value of aSTR.charAt(" + x + ") is " + aSTR.charAt(x));
						}
						
						if (x < bSTR.length()) {
							results += bSTR.charAt(x);
							//To test the existing string characters
							//System.out.println("the value of bSTR.charAt(" + x + ") is " + bSTR.charAt(x));
						}

						
						//x++;
						System.out.println("the value of results is now " + results);
													
					}
					//while(x < maxLength);
											
				}
				resultInt = Integer.parseInt(results);
				
				System.out.println("This is the value of resultInt " + resultInt);		
				
				return resultInt;
			}
				
		
		

	}