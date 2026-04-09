package com.tnsif.polymorphism;

class Father {
	int a = 9;
	void drink() {
		System.out.println("tea");
	}

}
class son extends Father{
	@Override 
	void drink() {
		System.out.println("old monk");
	}
	
}
public class Methodoverriding {
	public static void main(String[] args) {
		son n = new son();
		n.drink();
		
	}
}
