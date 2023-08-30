package com.Mohak;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,2,53,24};
        int num = linearSearch(arr,3434 );
        System.out.println(num);
        }
        //search for a target in array
    static int linearSearch(int[] arr, int target){
        if (arr.length ==0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        // this statement will hit if not target element is found
//        return -1;
        return  Integer.MAX_VALUE;
    }

    }
