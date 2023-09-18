package com.Mohak;

class Solution {
    public boolean hasAlternatingBits(int n) {
        int temp = (n>>1) & 1;
        while (n>0){
            int a = (n>>1) & 1;
            if (temp != a) return true;
            else return false;
        }
        return false;
    }
}