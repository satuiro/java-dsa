package com.Mohak;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2,5,7,34,56,78,79,86,94};
        System.out.println(OrderAgnosticBS(arr, 78));

    }
    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if (target==arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target<arr[mid]){
                    end = mid-1;
                } else if (target>arr[mid]) {
                    start = mid+1;
                }
            }else{
                if (target>arr[mid]){
                    end = mid-1;
                } else if (target<arr[mid]) {
                    start = mid+1;
                }
            }
        }
        return -1;

    }
}
