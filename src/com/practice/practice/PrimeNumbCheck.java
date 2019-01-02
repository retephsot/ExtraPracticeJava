package com.practice.practice;

public class PrimeNumbCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,m=0,flag=0;      
		  int number=10;//it is the number to be checked    
		  m=number/2;      
		  if(number==0||number==1){  
		   System.out.println(number+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(number%i==0){      
		     System.out.println(number+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(number+" is prime number"); }  
		  }//end of else  

	}

}
