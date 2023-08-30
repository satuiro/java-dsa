package com.Mohak;

public class PosInInfArr {
    public static void main(String[] args) {
        // start with box of size 2
        int[] arr = {2,3,5,6,7,8,9,
                10,33,44,57,61};
        System.out.println(ans(arr,44));
    }
    static int ans(int[] arr, int target){
        // find the range first
        // first take the size of the shoe box as 2
        int start = 0, end = 1;

        while(target>arr[end]){
            int temp = end+1; // the value of new start

            //double the box value
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr,start,end,target);

    }
    static  int binarySearch(int[] arr, int start, int end, int target){
        while (start<=end){
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
