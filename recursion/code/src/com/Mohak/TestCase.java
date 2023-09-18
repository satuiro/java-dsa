package com.Mohak;

import java.util.Arrays;

public class TestCase {
    public static void main(String[] args) {
//        System.out.println(5 ^ 1);
        int n = 14;
        int count = 0;
        while (n>0){
            n = n>>1;
            count++;
        }
        System.out.println(count);
    }


}
