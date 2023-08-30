package com.Mohak;

public class Maxitem {
    public static void main(String[] args) {
        int[] arr = {1,34,545,32,5};
        System.out.println(maxim(arr));
    }

    static int maxim(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max>arr[i]){
                max = max;
            }else{
                max = arr[i];
            }
        }
        return max;
    }
}
