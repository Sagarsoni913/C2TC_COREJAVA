package com.tns.Wrapper;

public class BooleanDemo {

	public static void main(String[] args) {
		Boolean b=new Boolean("YES"); // all the strings except true,True & TRUE will return false
		Boolean c=new Boolean("NO");  // all the strings except true,True & TRUE will return false
		Boolean d=new Boolean("True");	

		System.out.println(b);
		System.out.println(c);
		System.out.println(d);		
		System.out.println(b.equals(c));
	}

}
