package com.tnsif.polymorphism;
class A{
	A(String name){
		System.out.println("Hi im:"+ name);
	}
	A(String name ,int age ){
		System.out.println("Name is:"+ name);
		System.out.println("Age is:"+age);
	}
}
public class Constructor_overload {
public static void main(String[] args) {
	A ob =new A("Tanisha");
	A ob1=new A("Siya",20);
	
}
}
