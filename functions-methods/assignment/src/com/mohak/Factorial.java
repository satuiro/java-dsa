package com.mohak;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int fact = calcfactorial(n);
        System.out.println(fact);
    }

    static int calcfactorial(int n) {
        int prod = 1;
        for (int i = 1; i <= n ; i++) {
            prod = prod*i;
        }
        return prod;
    }
}
