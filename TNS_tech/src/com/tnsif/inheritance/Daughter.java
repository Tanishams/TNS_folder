package com.tnsif.inheritance;

	class Daughter extends Mother {
	    void car() {
	        System.out.println("I have a car");
	    }

	    public static void main(String[] args) {
	        Daughter d = new Daughter();
	        // accessing parent properties
	        System.out.println(d.salary);
	        d.main();
	    }
	}
