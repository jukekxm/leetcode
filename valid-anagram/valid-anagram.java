class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (charMap.get(c) == null) {
                charMap.put(c, 1);
            }
            
            else {
                int count = charMap.get(c);
                charMap.put(c, count + 1); 
            }
        }
        
        for (char c : t.toCharArray()) {
            if (charMap.get(c) == null) {
                return false;
            }
            
            int count = charMap.get(c);
            charMap.put(c, count - 1);
        }
        
        for (Character c : charMap.keySet()) {
            if (charMap.get(c) != 0) {
                return false;
            }
        }
        
        return true;
    }
}