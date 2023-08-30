package com.mohak;

import java.util.Scanner;

public class Voteelig {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(checkage(age));
    }

    private static boolean checkage(int age) {
        if (age>=18){
            return true;
        }else {
            return false;
        }

    }
}
