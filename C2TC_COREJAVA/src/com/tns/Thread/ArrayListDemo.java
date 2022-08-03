package com.tns.Thread;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();  //Growable size 
		l.add(10);                    //heterogenous datatypes are added                        
		l.add("A");                     
		l.add(5.8);
		l.add(null);
		System.out.println(l);
		l.remove(1);                  //removing elements from list
		l.add(1, "B");
	
		System.out.println(l);
	}

}
