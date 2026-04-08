package com.tnsif.payment;

class Gpay extends Payment {

    @Override
    void process() {
        System.out.println("processing via Gpay");
    }
    void dis() {
        super.process();
        process();
    }
    public static void main(String[] args) {
        Gpay g = new Gpay();
        g.dis();
    }
}