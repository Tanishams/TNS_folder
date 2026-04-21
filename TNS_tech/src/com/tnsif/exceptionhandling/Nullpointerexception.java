package com.tnsif.exceptionhandling;
//null pointer exception
public class Nullpointerexception {
public static void main(String[] args) {
	String str=null;
	try {
		System.out.println(str.length());
	}
	catch(Exception f) {
		System.out.println(f.getMessage());
	}
}
}
