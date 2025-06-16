package com.sharon.selenium;

//abstract class - class name
abstract class Animal{
	//method created in abstract
	abstract void makeSound();
	
	//normal method
	void sleep() {
		System.out.println("normal method value printed");
	}	
}
class Dog extends Animal{
	//calling parent class method in sub-class or child - Overridden
	void makeSound() {
		System.out.println("parent method called in child class");
	}
}
//Main class and method
public class abstraction {
//hiding internal details process and showing features of object
	//helps to reduce complexity and improves security of data
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create constructor to call methods indirectly in
		//abstraction we can't directly call methods
		Dog d = new Dog();
		d.makeSound();
		d.sleep();
	}
}