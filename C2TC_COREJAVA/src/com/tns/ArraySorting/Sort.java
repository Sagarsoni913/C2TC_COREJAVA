package com.tns.ArraySorting;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers ");
		int ar=sc.nextInt();
		
		int arr[]= {10,9,40,5,8,3,45};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++) {
				
				int temp=0;
				if(arr[j] <  arr[i]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println(arr[i]+" ");
		}

	}

	private static String[] nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
