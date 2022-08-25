package com.tns.selflearning;

public class Patterns {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++) {
				if(i+j>5)
				System.out.print(" *");
				else 
			    System.out.print("  ");
						
			for(int k=1;k<=i;k++)
			{
				if(k<1)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
				
			}
			System.out.println("");
			}
		
		}
	
	

}