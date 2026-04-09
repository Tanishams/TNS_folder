package com.tnsif.polymorphism;
class Calculator{
	int add(int a , int b) {
		return a+b;
	}
	double add(double a , double b) {
		return a+b;
	}
int add(int a, int b , int c) {
	return a+b+c;
}
}

public class Methodoverloading {
public static void main(String[] args) {
	Calculator c= new Calculator();
	System.out.println("Addition:"+c.add(1, 2));
	System.out.println("Add:"+c.add(4.3, 2.6));
	System.out.println("Addi:"+c.add(1, 2,3));

}
}
