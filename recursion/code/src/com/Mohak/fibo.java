package com.Mohak;

public class fibo {
    public static void main(String[] args) {
//         int ans = fibo(4);
        System.out.println(fiboFormula(50));

    }

    static int fiboFormula(int n){
        return (int)(Math.pow(1.68,n));
    }
    static int fibo(int n){
        // base condition
        if (n<2){
            return n;
                
        }

        return (fibo(n-1)+fibo(n-2));
    }
}
