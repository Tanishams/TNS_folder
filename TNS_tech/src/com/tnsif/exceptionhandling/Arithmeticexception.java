package com.tnsif.exceptionhandling;

public class Arithmeticexception {
public static void main(String[] args) {
	int num1=50/5;
	System.out.println(num1);
	
	int num2=50/10;
	System.out.println(num2);
	try {
		int num3=50/0;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	float num4=70/3;
	System.out.println(num4);
}
}
