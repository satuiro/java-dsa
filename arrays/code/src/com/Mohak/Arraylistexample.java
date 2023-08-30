package com.Mohak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylistexample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        int[] ans = new int[5];
        for (int i = 0; i < 5; i++) {
            int n = in.nextInt();
            list.add(n);
        }
        for (int i = 0; i < 5; i++) {
            for (int numb:list){
                ans[i] = numb;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
