package com.java;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,6,8,3,9,5,2);
        Node root = new Node(7);
        for(Integer data:list){
            Node.insertData(root,data);
        }

        Node.display(root);

        System.out.println("Height od the tree is : "+Node.heightOfTree(root));

        System.out.println("Max Value is Tree is : "+Node.maxValueInTree(root));

        System.out.println("min Value in the Tree : "+ Node.minValueInTree(root));



    }


}
