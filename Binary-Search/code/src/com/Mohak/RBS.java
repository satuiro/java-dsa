//package com.Mohak;
//
//public class RBS {
//    public static void main(String[] args) {
//        int[] arr = {3, 4, 6, 0, 1, 2};
//        System.out.println(search(arr,2));
//
//    }
//    static int search(int[] arr, int target){
//        int pivot = pivot(arr);
//
//        // in the case when pivot not found
//        // which means that the array is not rotated
//        if (pivot == -1){
//            return binarySearch(arr, target,0,arr.length-1);
//        }
//
//        // if pivot found
//        if (arr[pivot] == target){
//            return pivot;
//        }
////
//        if (target >= arr[0]){
//            return binarySearch(arr, target, 0,pivot-1);
//        }else{
//            return binarySearch(arr,target,pivot+1,arr.length-1);
//        }
//
//    }
//    static int pivot(int[] arr){
//        int start = 0, end = arr.length-1;
//        while (start<=end){
//            int mid = start + (end-start)/2;
//

//            if (mid<end && arr[mid] > arr[mid+1]) {
//                return mid;
//            }
//            if (mid>start && arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if (arr[mid] <= arr[start]){
//                end = mid -1;
//            }else {
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
//    static int binarySearch(int[] arr, int target, int start, int end ){
////        int start = 0;
////        int end = arr.length-1;
//
//        while(start <= end){
//            // find the middle element
//            int mid = start + (end-start)/2;
//
//            if (target<arr[mid]){
//                end = mid-1;
//            } else if (target>arr[mid]) {
//                start = mid+1;
//            }else {
//                // ans found
//                return mid;
//            }
//        }
//        return -1;
//    }
//    static int duplicatePivot(int[] arr){
//        int start = 0, end = arr.length-1;
//        while (start<=end){
//            int mid = start + (end-start)/2;
//
//            if (mid<end && arr[mid] > arr[mid+1]) {
//                return mid;
//            }
//            if (mid>start && arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if (arr[mid] <= arr[start]){
//                end = mid -1;
//            }else {
//                start = mid + 1;
//            }
//
//            if (arr[mid]==arr[start] && arr[mid] == arr[end]){
//
//                // in the case if start is pivot
//                if (arr[start]>arr[start+1]){
//                    return start;
//                }
//                start++;
//
//                if (arr[end]<arr[end-1]){
//                    return end-1;
//                }
//                end--;
//            }
//            // left side is sorted, so pivot in right
//            else if (arr[start]<arr[mid] || (arr[mid]==arr[start] && arr[mid] < arr[end])) {
//                start = mid+1;
//            }else{
//                    end = mid-1;
//        }
//        return -1;
//    }
//}
