//package com.Mohak;
//
//public class FindInMArray {
//    public static void main(String[] args) {
//
//
//    }
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = findPeakElement(mountainArr);
//        int firstTry = orderAgnosticBinarySearch(mountainArr,0,peak,target);
//        // check if it is -1 or not
//        if (firstTry != -1){
//            return firstTry;
//        }else{
//            int nextEl = orderAgnosticBinarySearch(mountainArr,peak,mountainArr[mountainArr.length-1],target)
//            return nextEl;
////        }
//        return -1;
//    }
//    static int findPeakElement(int[] nums) {
//        int start = 0, end = nums.length-1;
//        while (start<end){
//            int mid = start + (end-start)/2;
//            if (nums[mid]>nums[mid+1]){
//                end = mid;
//            }else {
//                start = mid +1;
//            }
//        }
//        return start; // this will return the index value of the Peak num
//    }
//
//    static  int orderAgnosticBinarySearch(int[] arr, int start, int end, int target){
//        boolean isAsc = arr[start]<arr[end];
//
//        if (isAsc){
//            while (start<=end){
//                int mid = start + (end-start)/2;
//
//                if (target<arr[mid]){
//                    end = mid - 1;
//                } else if (target>arr[mid]) {
//                    start = mid+1;
//                }else{
//                    return mid;
//                }
//            }
//
//        }else{
//            while (start<=end){
//                int mid = start + (end-start)/2;
//
//                if (target>arr[mid]){
//                    end = mid - 1;
//                } else if (target<arr[mid]) {
//                    start = mid+1;
//                }else{
//                    return mid;
//                }
//            }
//        }
//
//
//        return -1;
//    }
//}
