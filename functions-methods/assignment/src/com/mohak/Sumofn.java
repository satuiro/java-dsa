package com.mohak;

import java.util.Scanner;

public class Sumofn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(Sumnum(n));
    }

    private static int Sumnum(int n) {
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum = sum +i;
        }
        return sum;
    }
}
