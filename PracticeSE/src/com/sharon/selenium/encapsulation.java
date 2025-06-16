package com.sharon.selenium;

//wrapping var and methods in single unit and retrict direct access for few
//helps to implement abstraction
//achieved by access modifier
//i.e private var and to access that make getter, setter method public
class Student {
	//object + properties - private access within class
	private String name;
	private int age;
	private String work;
	
	//getter method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getWork() {
		return work;
	}
	
	//setter methods
	public void setName(String newName) {
		name = newName;
	}
	public void setAge(int newAge) {
		if (newAge > 1) {
			age = newAge;
		}
	}
	public void setWork(String newWork) {
		work = newWork;
	}
}
//main method
public class encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("test");
		student.setAge(0);
		student.setWork("plumber");
		
		System.out.println("Name: " + student.getName());
		System.out.println("age: " + student.getAge());
		System.out.println("work: " + student.getWork());
	}
}

