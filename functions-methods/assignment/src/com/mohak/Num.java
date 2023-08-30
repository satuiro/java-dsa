package com.mohak;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int great = greatest(num1, num2, num3);
        int small = smallest(num1, num2, num3);
        System.out.println(great+" "+small);
    }

    static int smallest(int num1, int num2, int num3) {
        if (num1<num2){
            if (num1<num3){
                return num1;
            } else {
                return num3;

            }
        }else {
            if (num2<num3){
                return num2;
            }else{
                return num3;
            }
        }
    }

    static int greatest(int num1, int num2, int num3) {
        if (num1>num2){
            if (num1>num3){
                return num1;
            } else {
                return num3;
                
            }
        }else {
            if (num2>num3){
                return num2;
            }else{
                return num3;
            }
        }
            

    }
}
