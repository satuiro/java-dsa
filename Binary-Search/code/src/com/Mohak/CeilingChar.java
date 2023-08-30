package com.Mohak;
/*
LeetCode 74 4
 */

public class CeilingChar {
    public static void main(String[] args) {
        char[] arr = {'a','i','l'};
        System.out.println(Ceiling(arr, 'l'));

    }
    static char Ceiling(char[] arr, char target){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if (target<arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return arr[start% arr.length]; // since the while loop is violated the start value will become larger than the target value
    }
}
