package com.mohak;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = markscheck(n);
        System.out.println(res);
    }

     static String markscheck(int n) {
        if (n >=91 && n<=100){
            return  "AA";
        } else if (n >=81 && n<=90) {
            return "AB";
        }else if (n >=71 && n<=80) {
            return "BB";
        }else if (n >=61 && n<=70) {
            return "BC";
        }else if (n >=51 && n<=60) {
            return "CD";
        }else if (n >=41 && n<=50) {
            return "DD";
        } else if (n<=40) {
            return "fail";

        }
         return null;
     }
}
