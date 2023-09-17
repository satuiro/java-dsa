package com.Mohak;

import java.util.Arrays;

public class TestCase {
    public static void main(String[] args) {
//        System.out.println(5 ^ 1);
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(flipAndInvertImage(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            for (int i = 0; i<(image[0].length+1)/2; i++){
                swap(row, i, image[0].length - i - 1);
            }

        }
        for (int i = 0; i<image.length; i++){
            for (int j = 0; j < image[0].length; j++) {
                image[i][j] ^= 1;
            }
        }
        return image;

    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
