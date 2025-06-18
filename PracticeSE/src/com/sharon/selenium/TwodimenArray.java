package com.sharon.selenium;
//syntax of 2 dimen = datatype[][] arrayName = new datatype[rows][columns];
import java.util.Arrays;


public class TwodimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twod = {
				{0, 1, 2, 3},   //R
				{11, 12, 13, 14}  //C
		};
		
		//doing for loop to iterate and get the values of rows and col
		
		for(int i=0; i<twod.length; i++) {  //R - consider inner loop
			
			for(int j=0; j<twod[i].length; j++) {  //C - consider outer loop
				
//cond1	print 		
				System.out.println("2D: " + twod[i][j]);
				
				int values = twod[i][j]; 
				
//cond2	>,< && 
				if (values >2 && values <15 && values % 2 !=0) {
					System.out.println("values at" + i + j + "=" + values);
				}
			
//cond 3     ADD   
			int[] add = {0, 1, 2, 3};
			int newEl = 5;
			
			int[] newArray = new int[add.length +1];
			
			for(int k=0; k<add.length; k++) {
				newArray[i] = add[i];
			}
			newArray[add.length] = newEl;
			System.out.println(Arrays.toString(newArray));
			//Arrays keyword from lib java.util.Arrays
			//toString printable string 
		}
			
	}
//cond4  sort asc/desc
		//ascending
		int[] asc = {348, 1, 111, 1999, 0};
		Arrays.sort(asc);
		System.out.println(Arrays.toString(asc));
		
		String[] sasc ={"zebra", "zoo", "apple", "ozone"};
		Arrays.sort(sasc);
		System.out.println(Arrays.toString(sasc));


	} }
