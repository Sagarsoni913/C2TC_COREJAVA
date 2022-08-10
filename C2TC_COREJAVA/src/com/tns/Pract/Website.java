package com.tns.Pract;

import java.util.Scanner;

public class Website {

	public static void main(String[] args) {
	
		
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the url ");
	  String url=s.nextLine();
	  
      String prot=url.substring(0, url.indexOf(":"));
      
      if(prot.equals("http"))
      {
      System.out.println("Hyper Text Transfer Protocol");
      }
      else if(prot.equals("ftp"))
      {
    	  System.out.println("File Transer Protocol");
      }
      else
      {
    	  System.out.println("not a vaild url");
      }
      
     
      String site=url.substring(url.lastIndexOf(".")+1);
      
      if(site.equals("com"))
      {
    	  System.out.println("Commercial website");
      }
      
      else if(site.equals("org"))
      {
    	  System.out.println("Organization website");
      }
      else if(site.equals("net"))
      {
    	  System.out.println("Network site");
      } 
     
		
		
		
		//can be written using Switch case
		
		/*
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the day no ");
		   int day=sc.nextInt();
		   
		   if(day==1)
		   {
			   System.out.println(" Monday");
		   }
		   else if(day==2)
		   {
			   System.out.println(" Tuesday");
		   }
		   else if(day==3)
		   {
			   System.out.println(" Wednesday");
		   }
		   else if(day==4)
		   {
			   System.out.println(" Thursday");
		   }
		   else if(day==5)
		   {
			   System.out.println(" Friday");
		   }
		   else if(day==6)
		   {
			   System.out.println(" Saturday");
		   }
		   else if(day==7)
		   {
			   System.out.println(" Sunday");
		   }
		   else
		   {
			   System.out.println("Not a valid day");
			   
		   } */
	}
}


