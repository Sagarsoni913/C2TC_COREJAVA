package com.tns.selflearning;

public class Array3 {

	public static void main(String[] args) {
		
		int i[][][]= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
					 //|____0th index______|  |_____1st index______| 
		
		
		System.out.println(i[0][1][2]);
		System.out.println(i[1][0][1]);
		
		System.out.println(i[1][1][1]);
		System.out.println(i[2][1][0]);
		System.out.println(i[1][2][0]);
		}

	}


