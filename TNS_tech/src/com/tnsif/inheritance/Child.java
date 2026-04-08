package com.tnsif.inheritance;

class Child extends Father {
    String cycle = "pink";

    void read() {
        System.out.println("java");
    }
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.money);  // from Father
        System.out.println(c.car);   // from Father
        System.out.println(c.cycle);  // from Child

        c.read();
    }
}
