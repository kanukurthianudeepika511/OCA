package com.oca;

public class Overloaded {


   private int rollNum;
   Overloaded()
   {
      rollNum =100;
   }
   Overloaded(int rnum)
   {
      this();
     
      rollNum = rollNum+ rnum;
   }
   public int getRollNum() {
	  return rollNum;
   }
   public void setRollNum(int rollNum) {
	  this.rollNum = rollNum;
   }
   public static void main(String args[])
   {
	   Overloaded obj = new Overloaded(15);
       System.out.println(obj.getRollNum());
    }
}