package com.Mohak;

public class Factors {
    public static void main(String[] args) {
//        factor1(20);
        factor2(36);
    }

    //complexity : O(n)
    static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i == 0){
                System.out.print(i + " ");
            }
        }
    }

    //complexity : O(sqrt(n))
    static void factor2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n%i == 0){
                if (n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }
}
