class Solution {
    public boolean isPalindrome(String s) {
        
        String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        StringBuilder sb = new StringBuilder(result);
        String reverse = sb.reverse().toString();
        
        if (result.equals(reverse)) {
            return true;
        }
      
        return false;
    }
}