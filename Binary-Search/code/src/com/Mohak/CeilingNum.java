package com.Mohak;

public class CeilingNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,16,18};
        System.out.println(Ceiling(arr, 23));

    }
    static int Ceiling(int[] arr, int target){
        int start = 0, end = arr.length-1;
        if (target>arr[end]){
            return -1;
        } // when the target value is larger than the value at the end
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if (target==arr[mid]){
                return arr[mid];
            }
            if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }
        }
        return arr[start]; // since the while loop is violated the start value will become larger than the target value
    }
}
