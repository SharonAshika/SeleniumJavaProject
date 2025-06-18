package com.sharon.selenium;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//split - used to split the string alphabets
		String s = "a/b/c/d";
		String[] a1 = s.split("/");
		System.out.println("split string using only regex:" + a1);
		for (String string : a1) { //taking each value to String 
			System.out.println(string);
		}
		String[] a2 = s.split("/", 3);
		for (String string : a2) {
			System.out.println(string);
		}
		
		//contains - checked letter contains in string 
		String a = "helllo";
		System.out.println("test:" + a.contains("a"));
		System.out.println("testt:" + a.contains("o"));
		
		//length - count value of string
		System.out.println("testL:" + a.length());
		
		//replace string 
		System.out.println("testR:" + a.replace("l", "w"));

   //substring - based on index return string 
		System.out.println("testSS:" + a.substring(2, 5));

		//concat() add 2 strings
		
		String b = "world";
		System.out.println("testC:" + a.concat(b));


	}


}
