class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int length = 200;
        
        for (String s : strs) {
            if (length > s.length()) {
                length = s.length();
            }
        }
        
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            
            for (int j = 1; j < strs.length; j++) {
                String targetStr = strs[j];
                char c2 = targetStr.charAt(i);
                
                if (c != c2) {
                    return sb.toString();
                }
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}