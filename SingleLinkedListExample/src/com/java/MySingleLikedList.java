package com.java;

public class MySingleLikedList {
    public Node head;
    String string;
    static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void addNodeAtBeginning(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public void addNodeAtTheEnd(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }else {
            Node cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = newNode;
        }
    }

    public void addNodeAtPosition(int data,int position){
        Node newNode = new Node(data);
        Node cur = this.head, prev = this.head;
        if (position == 1) {
            newNode.next = head;
            this.head = newNode;
            return;
        }

        while (cur.next != null && --position > 0) {
            prev = cur;
            cur = cur.next;
        }

        prev.next = newNode;
        newNode.next = cur;
    }

    public void display() {
        if (this.head == null) {
            System.out.println("The List is empty.");
        } else {
            System.out.println("The contents of the Singly Linked List are :");
            Node cur = this.head;
            while (cur != null) {
                System.out.println(cur.value);
                cur = cur.next;
            }
        }
    }

    public void deleteFirstOccurenceOfData(int data){
        if(this.head == null){
            System.out.println("List os Empty");
            return;
        }
        if(this.head.value==data){
            this.head = this.head.next;
            return;
        }
        Node cur = this.head, prev = this.head;
        while (cur.next!= null && cur.value != data){
            prev = cur;
            cur = cur.next;
        }
        if(cur!=null){
            prev.next = cur.next;
        }else{
            System.out.println("Data is not found in the list");
        }

    }

    public void deleteFirstNode(){
        if(this.head == null){
            System.out.println("list is empty");
        }else{
           this.head = this.head.next;
        }
    }

    public void deleteLastNode(){
        if(this.head == null){
            System.out.println("list is empty");
        }else{
            Node cur = this.head, prev = this.head;
            while(cur.next != null){
                prev = cur;
                cur = cur.next;
            }
            prev.next = null;
        }

    }

    public int size(){
        int size = 0;
        if(this.head == null){
            System.out.println("List is empty");
            return size;
        }else{
            Node cur = this.head;
            while (cur!=null){
                size++;
                cur = cur.next;
            }
            return size;
        }
    }

    public boolean contain(int data){
        if(this.head == null){
            System.out.println("List is empty...");
            return false;
        }else {
            if(this.head.value == data){
                return true;
            }
            Node cur = this.head;
            while (cur != null){
                if(cur.value == data){
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }else {
            return false;
        }
    }

    public int getNthElement(int position){
        if(isEmpty()){
            System.out.println("List is Empty");
            return 0;
        }else{
            return 0;
        }

    }



}
