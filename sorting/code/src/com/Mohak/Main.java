package com.Mohak;

import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        }
    static void bubble(int[] arr){
        // run the steps n-1 times
        boolean swapped;
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;
            // for each step max item comes at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you don't swap for a particular value i.e the array is sorted hence stop the loop
            if (!swapped){
                break;
            }
        }
    }
}

