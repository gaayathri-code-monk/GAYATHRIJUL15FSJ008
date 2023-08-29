package com.assignment;

public class ConstructorDemo {
	
//	ConstructorDemo(){ //default constructor
//		System.out.println("default constrcutor called...!!");
//	}
	ConstructorDemo(int a, int b){ //paramterized constructor
		System.out.println("param constrcutor called...!!"+ (a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //class - veetu blueprint 
		// object - home real veeedu 
		// constructor - manal , salli , chengal
		
		
		//class - is a blueprint to create object
		// object - is a real time entity which has state, behavior
		// constructor - when object is created , it will get initailized first 
		// when object is created , constructor is called first
		
		ConstructorDemo obj = new ConstructorDemo(3,4);
	}

}
