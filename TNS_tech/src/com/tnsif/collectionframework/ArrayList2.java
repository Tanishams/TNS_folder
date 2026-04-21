package com.tnsif.collectionframework;
import java.util.ArrayList;
import java.util.List;
public class ArrayList2 {
public static void main(String[] args) {
	List<String> f=new ArrayList<>();
	f.add("Apple");
	f.add("Mango");
	f.add("DragonFruit");
	f.add("Watermelon");
	//f.add(5);
	System.out.println(f.size());
	System.out.println(f.get(0));
	
	f.set(2, "orange");
	System.out.println(f);
	
	f.remove(0);
	System.out.println(f);
	
	/*if(f.contains("apple"));
	{
		System.out.println(f);
	}*/
	
	System.out.println(f.contains("Mango"));
	
	//to traverse each element
	for(String fruits:f) {
		System.out.println(fruits);
		
		f.clear();
		System.out.println(f);
		
		f.isEmpty();
	    System.out.println(f);	
	}
	
}
}
