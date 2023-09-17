package com.Mohak;
// bitwise
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,5,5,2,4,6,6,4};
        System.out.println(arrUnique(arr));
    }

    static int arrUnique(int[] arr) {
        int count = 0; 
        for (int el:
             arr) {
            count ^= el;
        }
        return count;
    }
}
