package com.oca;

public class Arguments {
int wheels;
 private Arguments(int wheels){
	        this.wheels = wheels;
	        System.out.println(wheels + " wheeler vehicle created.");
	    }

	    public static void main(String[] args) {

	        // calling the constructor by passing single value
	        Arguments a = new Arguments(2);
	        Arguments b= new Arguments(3);
	        Arguments c = new Arguments(4);
	    }
	}