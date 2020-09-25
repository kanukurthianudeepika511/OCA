package com.oca;
public class TestConcat 
{
	  public static void main(String[] args) 
	  {
		String Demo = "Anu ";
	    System.out.println("First String: " + Demo);
	    String name = "Deepika";
	    System.out.println("Second String: " + name);
	    String joinedString = Demo.concat(name);
	    System.out.println("Joined String: " + joinedString);
	  }
	}