package com.tnsif.exceptionhandling;
//demo for multiple catch block
public class Multiplecatchblock {
public static void main(String[] args) {
	int number[]=new int[4];
	try {
		int i=number[8];
		System.out.println("world");
	}
	catch(ArithmeticException h) {
		System.out.println("welcome");
	}
	catch(StringIndexOutOfBoundsException u) {
		System.out.println("hi");
	}
	catch(Exception j ) {
		System.out.println("College");
	}
}
}
