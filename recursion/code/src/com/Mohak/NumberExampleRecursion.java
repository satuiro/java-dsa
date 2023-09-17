package com.Mohak;

public class NumberExampleRecursion {
//     take an input of a number n and print till 5
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n==5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in stack
        // this is called tail recursion since last function call
        print(n+1);
    }
}
