class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        
        char [] chars = s.toCharArray();
        
        int start = 0;
        int end = chars.length - 1;
        
        while(start < chars.length/2) {
            if ( chars[start] != chars[end])
                return false;
            start ++;
            end --;
        }
        
        return true;
    }
}
