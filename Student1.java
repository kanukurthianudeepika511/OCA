package com.oca;
public class Student1 
{
	 
	public static void main(String[] args)
	{

	        int[][] a = {
	            {1, 4, 3}, 
	            {10, 8, 6, 9}, 
	            {7}, 
	        };
	      
	for (int[] innerArray: a)
	{
	         
	            for(int data: innerArray) {
	                System.out.println(data);
	            }
	        }
	    }
}
	    
	