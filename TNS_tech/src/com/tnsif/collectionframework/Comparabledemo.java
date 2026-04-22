package com.tnsif.collectionframework;
//single sort only 
import java.util.ArrayList;
import java.util.Collections;

//used for user defined classes
class Person implements Comparable<Person>{
String name;
int age;
Person(String name, int age){
	this.name=name;
	this.age=age;
}
void display() {
	System.out.println("name:"+name+ "age:"+age);
}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}
public class Comparabledemo{
	public static void main(String[] args) {
		ArrayList<Person> al= new ArrayList<>();
		al.add(new Person("john",30));
		al.add(new Person("sushma",7));
		al.add(new Person("roshni",38));
		al.add(new Person("tanisha",50));
Collections.sort(al);
for(Person g:al) {
	g.display();
}
}
}