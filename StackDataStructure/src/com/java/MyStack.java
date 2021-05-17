package com.java;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<Integer> list;
    int top;
    int capacity;

    public MyStack(int size) {
        this.list = new ArrayList<>(size);
        this.top = -1;
        this.capacity = size;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){
        if(top == capacity){
            return true;
        }else {
            return false;
        }
    }

    public void push(Integer data){
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        list.add(++top,data);
    }

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return list.get(top);

    }

    public Integer pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        Integer result = list.get(top);
        list.remove(list.size()-1);
        //top--;
        return result;

    }

    public Integer size(){
        return top+1;
    }

    public void printStack(){
        for(Integer i : list){
            System.out.println(i);
        }
    }



}
