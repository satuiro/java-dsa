package com.Mohak;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,7,34,56,78,79,86,94};
        System.out.println(binarySearch(arr, 78));

        }
        // return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // find the middle element
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    }
