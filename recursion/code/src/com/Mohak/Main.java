package com.Mohak;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num = 14;
        int count = 0;
        while (num != 0){
            if ((num & 1)==1){
                num--;
            }else{
                num /=2;
            }
            count++;
        }
        System.out.println(count);
    }
}