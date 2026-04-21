package com.tnsif.exceptionhandling;
//demo for with matching catch block
public class Test1 {
public static void main(String[] args) {
	try {
		System.out.println(66/0);
		
	}
	
	catch(ArithmeticException r) {
		System.out.println(r.getMessage());
	}
	finally {
		System.out.println("Welcome");
	}
}
}
