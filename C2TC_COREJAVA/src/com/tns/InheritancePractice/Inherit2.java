package com.tns.InheritancePractice;

class Sa
{
	int x=50;

void msg()
{
	System.out.println("CHILD BASE CLASS ");
}
	}

class B extends Sa{
int x=20;
	int y=190;
	
	void msg()
	{
		System.out.println("Child Class 1st Method ");
	}
	
	void msg2()
	{
		System.out.println("Child Class 2nd Method ");
	}
	

public class Inherit2 extends B {

	public static void main(String[] args) {
		

	}

}
}
