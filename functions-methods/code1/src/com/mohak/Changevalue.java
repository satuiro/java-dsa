package com.mohak;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {1,23,5,4};
        change(arr);
        System.out.println(arr);
    }

   static void change(int[] nums) {
        nums[0] = 3;
    }
}
