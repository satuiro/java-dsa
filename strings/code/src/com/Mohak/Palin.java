package com.Mohak;

public class Palin {
    public static void main(String[] args) {
        System.out.println(isPalindrome("  "));

    }
    static boolean isPalindrome(String str){
        if (str.isEmpty()){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if (start != end){
                return false;
            }

        }
        return true;
    }
}
