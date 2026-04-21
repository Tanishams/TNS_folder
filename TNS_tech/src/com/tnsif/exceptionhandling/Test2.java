package com.tnsif.exceptionhandling;
//no matching catch block
public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(66/0);
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println(r.getMessage());
		}
		finally {
			System.out.println("welcome");
		}
	}

}
