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
	}
}


