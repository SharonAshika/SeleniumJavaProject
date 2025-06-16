package com.sharon.selenium;

//overridding - run- time
//over-loading - complie-time - same method name used in different argument (scenarios)
class Addition{
	int add(int a, int b) {
		return a+b;
	}
	String add(String c, String d) {
		return c+d;
	}
	float add(float e, float f) {
		return e+f;
	}
}
public class polymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Addition a = new Addition();
 System.out.println("add method1: "+ a.add(1, 0));
 System.out.println("add method2: "+ a.add("sharon", "ashika"));
 System.out.println("add method2: "+ a.add(00.1f, 0.0020f));
	}
}


