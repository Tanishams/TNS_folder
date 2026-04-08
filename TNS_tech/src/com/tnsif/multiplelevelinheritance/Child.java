package com.tnsif.multiplelevelinheritance;

class Child extends Daughter {

    public static void main(String[] args) {
        Child c = new Child();
        // Father
        System.out.println(c.salary);
        c.car();
        // Mother
        System.out.println(c.jewellery);
        c.cook();
        // Daughter
        System.out.println(c.hobby);
        c.play();
    }
}
