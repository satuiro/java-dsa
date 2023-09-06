class Solution {
    public String defangIPaddr(String addr) {
        String ans = "";

        for (int i = 0; i < addr.length(); i++){
            if (addr.charAt(i)!='.'){
                ans += addr.charAt(i);
            }else{
                ans += "[.]"; 
            }
        } 
        return ans; 
        
    }
}