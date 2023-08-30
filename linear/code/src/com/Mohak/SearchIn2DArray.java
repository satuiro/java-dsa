package com.Mohak;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,56},
                {232,4343,54}
        };
        int target = 56;
        System.out.println(searhl(arr, target));
    }

    static boolean searhl(int[][] arr, int target) {
    // considering the array.len !=0 return the index value
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return true;
//                    Integer.MAX_VALUE
                }
            }

        }
        return false;
    }
}
