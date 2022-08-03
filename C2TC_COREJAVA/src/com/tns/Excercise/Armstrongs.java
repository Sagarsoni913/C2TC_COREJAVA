package com.tns.Excercise;

import java.util.Scanner;

public class Armstrongs {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    int sum=0;
    int m=n;
    int power=0;   
    int digit=0;
    
   while(n>0)
   {
	                  //display the digits
	   n=n/10;
	   power++;
   }
   while(n>0)
   {
	   digit=n%10;
	   sum=(int)(sum+(Math.pow(n,power)));
      
   }
    
   System.out.println(sum);
   
	   if(sum==m) 
	   {
		   System.out.println("It is an Armstrongs number");
	   }
	   else
	   {
		   System.out.println("It is not an Armstrongs number");
	   }
   
   sc.close();

	}

}
