class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String smallestString = strs[0];
        String largestString = strs[strs.length - 1];
        
        String longestCommonPrefix = "";
        
        for(int i = 0; i < smallestString.length(); i++) {
        if(smallestString.charAt(i) != largestString.charAt(i))
        {
            break;
        }    
            longestCommonPrefix += smallestString.charAt(i); 
        }
        return longestCommonPrefix;
    }
}
