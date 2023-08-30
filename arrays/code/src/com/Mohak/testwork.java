package com.Mohak;

public class testwork {
    public static void main(String[] args) {
        int[] arr = {1,23,45,4464,43232};
        int evensum = 0;
        for (int number : arr){
            int rem = 0;
            int digit = 0;
            while (number>0){
                rem = number%10;
                number /= 10;
                digit++;

            }
            if (digit%2==0){
                evensum++;
            }
        }
        System.out.println(evensum);
    }
}
