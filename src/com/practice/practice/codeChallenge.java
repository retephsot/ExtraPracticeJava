package com.practice.practice;

public class codeChallenge {

	public static int length;
	public static int resultNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] intArray = new int[] {1,1,2,3,3};

		System.out.println("the array values are :");
		for(int i = 0; i < intArray.length; ++i) {
			
			System.out.println("the value of index " + i + " is " + intArray[i]);
		}
		
		resultNumber = lonelyInteger(intArray);
		
		System.out.println("The value of resultNumber is " + resultNumber);
		
	}

	public static int lonelyInteger(int[] intArray) {
	int length = intArray.length;
	System.out.println("The length value is " + length);
    int lonelyNumber = 0;
    
    for (int i = 0; i < length-1; i++)
    {
    int compare = intArray[i];
    
    	for (int j = 0; j < length-1; j++)
    	{
    		if(compare != intArray[j])
    			{
    				lonelyNumber = compare;
    			}
    
    	}
    }

    System.out.println("The lonelyNumber is " + lonelyNumber);   
    return lonelyNumber;
	}

}
