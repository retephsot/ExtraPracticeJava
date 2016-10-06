package com.practice.practice;

public class arraypractice1 {
	
	public static int A;
	public static int B;	
	public static int length;
	public static int resultsB;
	
	public static void main(String[] args) {
		
		length = 5;
		
		int arrayA[] = {1,10,1,8,2};
		
	 resultsB = isArrayinOrder(arrayA);
	
	if (resultsB == 0)
		
	{
		System.out.println("The result is " + resultsB);
		System.out.println("The array cannot be properly sorted in one iteration");
	}
	
	if (resultsB == 1)
	{
		System.out.println("The result is " + resultsB);
		System.out.println("The array can be properly sorted in one iteration.");
	}
		
	}
	
	public static int isArrayinOrder(int[] arrayA)
	{
		int countLoop = 0;
		int result = 0;
		int arrayValue = 0;
		for (int i = 0; i < length; ++i)
		{
			arrayValue = arrayA[i];
			System.out.println("the values of arrayA at index " + i + " is " + arrayValue);
		}
		
		for (int s=0; s<arrayA.length-1; s++)
		{
		
			for (int k=0; k<arrayA.length-1; k++)
			{
				if(arrayA[k]>arrayA[k+1])
				{
					int temp=0;
					temp=arrayA[k];
					
					arrayA[k] = arrayA[k+1];
					arrayA[k+1] = temp;
					countLoop += 1;
					
					System.out.println("The countLoop value is now " + countLoop);
				}
			}
		}
		
		for (int s = 0; s <= arrayA.length-1; s++)
		{
			System.out.println(arrayA[s]);
		}
		
		if (countLoop > 2)
		{
			result = 0;
		}
		
		if (countLoop <= 2)
		{
			result = 1;
		}
		return result;	
	}
	
}
