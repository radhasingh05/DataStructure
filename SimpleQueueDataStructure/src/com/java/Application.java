package com.java;

public class Application {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(10);
        //myQueue.deQueue();
        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);
        myQueue.enQueue(40);
        myQueue.deQueue();
        System.out.println("display queue");
        myQueue.display();

    }
}
