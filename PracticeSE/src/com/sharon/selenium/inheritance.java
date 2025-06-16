package com.sharon.selenium;

//one class object(properties), methods/variable accessed by another class.
//why? code re-use
//we use "extends" keyword to implement inheritance
class ParentClass{
void apple() {
	  System.out.println("apple category: Fruit" );
}
}
class ChildOne extends ParentClass{
void Cat() {
	  System.out.println("cat category: Animal" );
}
}
class ChildTwo extends ParentClass{
void Rose() {
	  System.out.println("Rose category: Flower" );
}
}
public class inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildTwo d = new ChildTwo();
		d.apple();
		d.Rose();
		
		ChildOne c = new ChildOne();
     c.Cat();
	}
}
