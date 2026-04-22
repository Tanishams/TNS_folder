package com.tnsif.collectionframework;

import java.util.Vector;

public class Vectordemo {
    public static void main(String[] args) {

        Vector<String> s = new Vector<String>();

        s.add("A");
        s.add("b");
        s.add("h");
        s.add("A");
        s.add(null);

        System.out.println(s);
        System.out.println(s.size());

        // Correct index (0–4)
        System.out.println(s.get(2));  

        // Correct index (≤ size)
        s.add(5, "tani");  
        System.out.println(s);

        s.set(2, "Tanisha");
        System.out.println(s);

        System.out.println(s.capacity());
        System.out.println(s.contains("A"));
        System.out.println(s.indexOf("h"));

        s.remove(0);
        System.out.println(s);
    }
}