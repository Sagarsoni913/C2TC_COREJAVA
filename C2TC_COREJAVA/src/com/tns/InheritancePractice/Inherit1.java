package com.tns.InheritancePractice;
 

class C {
int a=30;
}

 class A extends C
{  
	int a =50;
}

public class Inherit1 extends A
{
public static void main(String[] args) {
		
	
 	C obj=new C();
 	System.out.println("value of a: " +obj.a);

	A obj1=new A();
	System.out.println("value of a: " +obj1.a);
}
}