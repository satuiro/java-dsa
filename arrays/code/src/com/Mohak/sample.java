package com.Mohak;

public class sample {
    public static void main(String[] args) {

    }
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i<2*n; i++){
            if (i<n){
                ans[i] = nums[i];
            }else{
                for (int ne = 0; ne<n; ne++){
                    ans[i] = nums[ne];
                }
            }
        }
        return ans;
    }
}
