package com.sharon.selenium;

//interface - achieve abstraction by multiple inheritance.
//abstraction by "extends" ; interface by "implements"
//we use "interface" as keyword in program 
//interface can't have constructor 
//and can't use access modifier

interface Parent{
	void methodone();
	
	void methodtwo();
}

class Child implements Parent{
	public void methodone()
{
	System.out.println("metyhod1");
}
	public void methodtwo()

{
	System.out.println("metrhod2");
}
}

public class InteFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.methodone();
		c.methodtwo();

	}

}
