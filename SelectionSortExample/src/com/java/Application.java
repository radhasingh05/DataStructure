package com.java;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println("Selection sort using nested for loop");
        int[] result = selectionSort(new int[]{6,4,2,8,5,9,2,1,7});
        Arrays.stream(result).forEach(e-> System.out.print(e+" "));
        System.out.println();
        System.out.println("Selection sort desc order using nested for loop");
        result = selectionSortDesc(new int[]{6,4,2,8,5,9,2,1,7});
        Arrays.stream(result).forEach(e-> System.out.print(e+" "));


    }

    public static int[] selectionSort(int[] array){
        int temp;
        int min_value_index;
        for(int i=0;i<array.length-1;i++){
            min_value_index = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[min_value_index]){
                    min_value_index = j;
                }
            }
            temp = array[i];
            array[i] = array[min_value_index];
            array[min_value_index] = temp;
        }
        return array;
    }

    public static int[] selectionSortDesc(int[] array){
        int temp;
        int max_value_index;
        for(int i=0;i<array.length-1;i++){
            max_value_index = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j] > array[max_value_index]){
                    max_value_index = j;
                }
            }
            temp = array[i];
            array[i] = array[max_value_index];
            array[max_value_index] = temp;
        }

        return array;
    }
}
