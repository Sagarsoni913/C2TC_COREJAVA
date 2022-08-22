package com.tns.Pract;

import java.util.Scanner;

public class RadixLeap
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Year ");
		int Year=sc.nextInt();
		
		if(Year % 4 == 0)
		{
			if(Year%100==0)
			 {
			   if(Year%400==0)
			     {
				   System.out.println("It is a leap Year ");
			     }
			   else
			      {			
				   System.out.println("It is not a leap Year ");			   }
			  }
			else
			    {
				   System.out.println("It is a leap Year ");	
			    }
		}
		else
		{
			   System.out.println("It is not a leap Year ");
		}
		
		
		
		
		
		
		
		
		/*	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		String num=sc.next();
		
		if(num.matches("[10]+"))
		{
			System.out.println(" -:Binary Radix=2");
		}
		else if(num.matches("[0-7]+"))
		{
			System.out.println(" -:Octal Radix=8");
		}
		else if(num.matches("[0-9A-F]+"))
		{
			System.out.println(" :-Hexadecimal Radix=16");
		}
		else if(num.matches("[0-9]+"))		{
			System.out.println(" -:Decimal Radix=10");
		}
		else 
		{
			System.out.println("It is not a number");
		}
				
 	} */

}
}