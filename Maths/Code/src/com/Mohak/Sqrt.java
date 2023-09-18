package com.Mohak;

public class Sqrt {
    public static void main(String[] args) {
    System.out.printf("%.3f",sqrt(40, 3)); // pretty printing to use to print uptil 3 decimal places
    }
    static double sqrt(int n, int p){
        int s = 0;
        int e = n;

        double root = 0.0;
        while (s<=e){
            int m = s + (e-s)/2;

            if (m*m == n){
                return m;
            }
            if (m * m > e){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }

        double incr = 0.1   ;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
