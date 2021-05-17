package com.java;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public static void insertData(Node root,int data){

        if(root == null){
            root = new Node(data);
        }else{
            if(root.data > data){
                if(root.left != null){
                    root = root.left;
                    insertData(root,data);
                }else{
                    root.left = new Node(data);
                }
            }else{
                if(root.right != null){
                    root = root.right;
                    insertData(root,data);
                }else{
                    root.right = new Node(data);
                }
            }
        }

    }

    //in order
    public static void display(Node root){
        if(root != null){
            display(root.left);
            System.out.println(root.data);
            display(root.right);
        }
    }

    // pre order
    public static void preOrder(Node root){
        if(root != null){
            System.out.println(root.data);
            display(root.left);
            display(root.right);
        }
    }

    // post order
    public static void postOrder(Node root){
        if(root != null){
            display(root.left);
            display(root.right);
            System.out.println(root.data);
        }
    }

    public static int heightOfTree(Node root){
        if(root != null){
                int leftDepth = heightOfTree(root.left);
                int rightDepth = heightOfTree(root.right);
            if(leftDepth > rightDepth){
                return (leftDepth+1);
            }else {
                return (rightDepth+1);
            }
        }else {
            return 0;
        }
    }

    public static int maxValueInTree(Node root){
        if(root != null){
            int result = root.data;
            int leftData = maxValueInTree(root.left);
            int rightData = maxValueInTree(root.right);
            if(leftData>result){
                result = leftData;
            }
            if(rightData>result){
                result =rightData;
            }
            return result;

        }else {
            return 0;
        }
    }

    public static int minValueInTree(Node root){
        if(root != null){
            int result = root.data;
            int leftData = minValueInTree(root.left);
            int rightData = minValueInTree(root.right);

            if(leftData<result){
                if (leftData >0)
                    result = leftData;
            }
            if(rightData<result){
                if(rightData>0)
                    result = rightData;
            }
            return result;
        }else {
            return 0;
        }

    }

    public static void deleteNode(Node root,int data){
        if(root != null){

        }
    }


}
