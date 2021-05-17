package com.java;

public class Application {
    public static void main(String[] args) {
        MySingleLikedList singleLikedList = new MySingleLikedList();

        singleLikedList.addNodeAtBeginning(10);
        singleLikedList.addNodeAtBeginning(30);
        singleLikedList.addNodeAtBeginning(50);
        singleLikedList.addNodeAtBeginning(50);

        singleLikedList.display();

        System.out.println("add node at end of the linked list");

        singleLikedList.addNodeAtTheEnd(80);

        singleLikedList.display();

        System.out.println("add node at position 2 in linked list");

        singleLikedList.addNodeAtPosition(90,2);

        singleLikedList.display();

        System.out.println("delete the 30 from list");

        singleLikedList.deleteFirstOccurenceOfData(30);

        singleLikedList.display();

        System.out.println("delete the first node starting point ");

        singleLikedList.deleteFirstNode();

        singleLikedList.display();

        System.out.println("delete the last node end node");

        singleLikedList.deleteLastNode();

        singleLikedList.display();

        System.out.println("size of the list is : "+ singleLikedList.size());

        System.out.println("List contains 30 : "+singleLikedList.contain(30));
        System.out.println("List contains 50 : "+singleLikedList.contain(50));
    }
}
