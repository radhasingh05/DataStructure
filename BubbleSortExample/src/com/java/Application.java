package com.java;


import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println("Bubble sort using while loop , for loop");
        int[] result = bubbleSort(new int[]{6,4,2,8,2,5,7,1,9});
        Arrays.stream(result).forEach(e-> System.out.print(e+" "));
        System.out.println();
        System.out.println("Bubble sort using nested for loops");
        result = bubbleSort2(new int[]{6,4,2,8,2,5,7,1,9});
        Arrays.stream(result).forEach(e-> System.out.print(e+" "));
        System.out.println();
        System.out.println("******* Bubble Sort Descending order *******");
        System.out.println("Bubble sort desc Order using nested for loop");
        result = bubbleSortDesc1(new int[]{6,4,2,8,2,5,7,1,9});
        Arrays.stream(result).forEach(e-> System.out.print(e+" "));
        System.out.println();
        System.out.println("Bubble sort desc Order using while loop , for loop");
        result = bubbleSortDesc2(new int[]{6,4,2,8,2,5,7,1,9});
        Arrays.stream(result).forEach(e-> System.out.print(e+" "));
    }

    public static int[] bubbleSort(int[] array){
       boolean sorted = false;
       int temp;
       while(!sorted){
           sorted = true;
           for(int i=0; i<array.length-1;i++){
               if(array[i] > array[i+1]){
                   temp = array[i];
                   array[i] = array[i+1];
                   array[i+1] = temp;
                   sorted = false;
               }
           }
       }
       return array;
    }

    public static int[] bubbleSort2(int[] array){
        int temp;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }

    public static int[] bubbleSortDesc1(int[] array){
        int temp ;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] < array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSortDesc2(int[] array){
        int temp;
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i=0;i<array.length-1;i++){
                if(array[i] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

}
