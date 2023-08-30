//package com.Mohak;
//
//public class PosArray {
//    public static void main(String[] args) {
//        int[] arra = {2,4,4,5,6};
//        int[] arr = posReturn(arra);
//    }
//    static int posReturn(int[] arr,int target, boolean findStart){
//        int ans = 0, start = 0, end = arr.length;
//        while(start<=end){
//            int mid = start +(end-start)/2;
//
//            if (target<arr[mid]){
//                end = mid - 1 ;
//            }else if(target>arr[mid]){
//
//                start = mid+1;
//            }else {
//                 ans = mid;
//                 if (findStart){
//                     end = mid-1;
//                 }else{
//                     start = mid+1;
//            }
//            }
//
//        }
//        return -1;
//}
