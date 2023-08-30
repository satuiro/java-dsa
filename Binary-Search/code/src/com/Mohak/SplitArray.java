package com.Mohak;

public class SplitArray {
    public static void main(String[] args) {

    }
    static int SplitArray(int[] arr, int m){
        int start = 0, end =0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }

        while (start<end){
            // try for the middle as pot answer
            int mid = start + (end-start)/2;

            // calculate 
        }
        return end;
    }
}
