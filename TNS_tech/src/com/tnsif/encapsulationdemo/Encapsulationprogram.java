package com.tnsif.encapsulationdemo;
class Human1{
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age;
	private String name;
}

public class Encapsulationprogram {

	public static void main(String[] args) {
		Human1 h=new Human1();
		h.setAge(21);
		h.setName("rahul");
		
		System.out.println(h.getAge());
		System.out.println(h.getName());
		
		h.setAge(16);
		h.setName("guru");
		
		System.out.println(h.getAge());
		System.out.println(h.getName());

	}

}
