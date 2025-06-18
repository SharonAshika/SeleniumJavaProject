package com.sharon.selenium;
//a class is derived from a class which is also derived from another class —
//forming a chain of inheritance. Class A → Class B → Class C


class ParentMultiLevel{
	void testOne() {
		System.out.println("add:1+2=3");
	}
}

class ChildOneMultiLevel extends ParentMultiLevel {
	void testTwo() {
		System.out.println("sub: 1-2=-1");
	}
}

class SubClassChildOneMultiLvl extends ChildOneMultiLevel{
	void testThree() {
		System.out.println("Mul:1*2=2");
	}
}


public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor made from class 3
		SubClassChildOneMultiLvl p = new SubClassChildOneMultiLvl();
		p.testOne();
		p.testTwo();
		p.testThree();
	

	}

}
