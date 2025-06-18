package com.sharon.selenium;

//Array - store same type of multiple values under single variables
//Types: 1 dimentional array

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{ } - initialize values
		//[ ] - declares or access values
      int[] numbers = {10, 20, 30, 40, 50, 60};
      System.out.println("Input array: " + numbers);
      
      for(int i =0 ; i<numbers.length; i++) {
    	  System.out.println("print based on indexes:" +  i + ": " + numbers[i]);
      }
      
      
	}

}
