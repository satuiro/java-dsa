package com.mohak;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sumof = sumtwo(num1,num2);
        System.out.println(sumof);
    }

    static int sumtwo(int num1, int num2) {
        return num1+num2;
    }
}
