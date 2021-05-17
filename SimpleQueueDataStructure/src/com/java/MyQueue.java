package com.java;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> list;
    int size;
    int start;
    int end;

    public MyQueue(int size) {
        this.list = new ArrayList<>(size);
        this.size = size;
        this.start = -1;
        this.end = -1;
    }

    public boolean isEmpty(){
        if(start == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){
        if(end == size-1 && start == 0){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(Integer data){
        if(isFull()){
            System.out.println("Queue is full..");
        }else{
            if(start == -1) start = 0;
            end++;
            list.add(end,data);
        }
    }

    public int deQueue(){
        int result ;
        if(isEmpty()){
            System.out.println("Queue is Empty...");
            return (-1);
        }else{
            result = list.get(start);
            list.remove(start);
            if(start>=end){
                start=-1;
                end=-1;
            }else{
                start++;
            }
            return result;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            for(Integer integer:list){
                System.out.println(integer);
            }
        }
    }
}
