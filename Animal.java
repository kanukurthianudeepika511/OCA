package com.oca;

import java.io.*; 

class Program
{ 
   
	Program(String name) 
    { 
        System.out.println("Constructor with one " + 
                      "argument - String : " + name); 
    } 
  
	Program(String name, int age) 
    { 
  
        System.out.println("Constructor with two arguments : " + 
                " String and Integer : " + name + " "+ age); 
  
    } 
   
	Program(long id) 
    { 
        System.out.println("Constructor with one argument : " + 
                                            "Long : " + id); 
    } 
} 
  
class GFG 
{ 
    public static void main(String[] args) 
    { 
      
    	Program ge = new Program("Shikhar"); 
  
       
    	Program ge1 = new Program("Dharmesh", 26); 
      
    	Program ge2 = new Program(325614567); 
    } 
} 

