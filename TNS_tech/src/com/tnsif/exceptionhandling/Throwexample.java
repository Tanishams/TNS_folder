package com.tnsif.exceptionhandling;

public class Throwexample {
	public static void main(String[] args) {
		int age= 10;
		if(age<18) {
			//manually throwing exception
			throw new ArithmeticException("you are not eligible to vote");
		}
		else {
			System.out.println("you are eligible to vote");
		}
	}

}
