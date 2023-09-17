package com.Mohak;

import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(seBits(n));
    }

    static int seBits(int n) {
    int count = 0;
    while (n>0){
        count++;
//        n = n & (n-1);


    }

    return count;
    }
}
