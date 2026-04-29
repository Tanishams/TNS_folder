/*
 * Program: Order Processing using Runnable Interface
 * 
 * Concept:
 * - Demonstrates multithreading using Runnable interface
 * - Each thread processes a different order
 * - Threads run concurrently
 * 
 * Key Points:
 * - Runnable requires implementation of run() method
 * - Thread class is used to start execution
 * - sleep() simulates processing time
 */

package com.tnsif.multithreading;

public class OrderProcessing implements Runnable {

    String orderName;

    // Constructor to initialize order name
    OrderProcessing(String orderName) {
        this.orderName = orderName;
    }

    // run() method contains the task to be executed by thread
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started Processing " + orderName);
        
        try {
            Thread.sleep(1000); // simulate processing time
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }

        // Print after processing is completed
        System.out.println(Thread.currentThread().getName() + " Completed " + orderName);
    }

    public static void main(String[] args) {

        // Creating Runnable objects
        OrderProcessing r1 = new OrderProcessing("Order-1");
        OrderProcessing r2 = new OrderProcessing("Order-2");
        OrderProcessing r3 = new OrderProcessing("Order-3");

        // Creating Threads and assigning names
        Thread t1 = new Thread(r1, "Worker-1");
        Thread t2 = new Thread(r2, "Worker-2");
        Thread t3 = new Thread(r3, "Worker-3");

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}