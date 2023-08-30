package com.Mohak;

import java.util.Arrays;

public class AssignmentTest {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(sumZero(5)));
        int a = 123;
        String ab = a +"";
    }
    static int[] sumZero(int n) {
        int[] ans = new int[n];

        int left =0, right = n-1, start = 1;
        while (left<right){
            ans[left++] = start;
            ans[right--] = -start;
            start++;
        }
        return ans;
    }
}
