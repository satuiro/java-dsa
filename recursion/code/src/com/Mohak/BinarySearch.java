package com.Mohak;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,10};
        int ans = search(arr, 1, 0,4);
    }
    static int search(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (target<arr[mid]){
            return search(arr, target, s, mid-1);
        }
        return search(arr, target, mid+1,e);
    }
}
