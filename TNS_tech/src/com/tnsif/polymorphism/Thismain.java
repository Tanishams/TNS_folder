package com.tnsif.polymorphism;
class Person{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public void display() {
	System.out.println("The name of the person:"+name);
}
}
public class Thismain {
	public static void main(String[] args) {
		Person p= new Person();
		p.setName("Tanisha");
		System.out.println(p.getName());
		p.display();
	}
}
