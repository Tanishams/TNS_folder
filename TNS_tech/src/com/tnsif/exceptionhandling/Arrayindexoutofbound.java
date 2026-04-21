package com.tnsif.exceptionhandling;
//arayindex demo
public class Arrayindexoutofbound {
public static void main(String[] args) {
	int arr[]= new int[4];
	System.out.println(arr.length);
	try {
		int i= arr[8];
	}
	catch(ArrayIndexOutOfBoundsException h) {
		System.out.println(h);
	}
}
}
