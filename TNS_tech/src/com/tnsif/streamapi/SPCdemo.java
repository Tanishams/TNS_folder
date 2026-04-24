package com.tnsif.streamapi;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//supplier predicate and consumer
public class SPCdemo {
	public static void main(String[] args) {
		//supplier: no input but returns a value
		Supplier<String> s= ()-> "Hello from supplier";
		String value=s.get();
		System.out.println(value);
		
		//predicate: takes one input and returns a boolean value
		Predicate<Integer> iseven= number->number%2==0;
		int testnumber=10;
		if(iseven.test(testnumber)) {
			System.out.println(testnumber+"is even");
		}
		else {
			System.out.println(testnumber+"is odd");
		}
		Consumer<String> c = message -> 
        System.out.println("Consumer received: " + message);

c.accept("Hello World");
	}

}
