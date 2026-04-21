package com.tnsif.exceptionhandling;
//throws is used during the method declaration 
public class Throwsdemo {
static void divide() throws ArithmeticException{
	int num =10/0;
	
}
public static void main(String[] args) {
	try {
		divide();
	}
	catch(ArithmeticException e ) {
		System.out.println("cannot be divided by zero");
	}
}
}
