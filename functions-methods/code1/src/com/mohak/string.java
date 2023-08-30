package com.mohak;

public class string {
    public static void main(String[] args) {
//        g
//        String g = greetings();
//        System.out.println(g);
//        method ii : passing as a parameter
        String new1 = "this is a test string";
        String b = greetings2(new1);
        System.out.println(b);

    }
    static String greetings(){
        String hey = "hey there";
        return hey;
    }
    static String greetings2(String y){
        return y;
    }
}
