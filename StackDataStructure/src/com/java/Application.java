package com.java;

public class Application {
    public static void main(String[] args) {

        MyStack myStack = new MyStack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        myStack.printStack();

        System.out.println("peek "+myStack.peek());
        System.out.println("pop "+myStack.pop());
        //myStack.push(50);
        //myStack.push(60);
        myStack.printStack();

        System.out.println("Size of the Stack is : "+myStack.size());

    }
}
