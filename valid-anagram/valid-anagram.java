class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> charMap = new HashMap<>();
        Map<Character, Integer> charMap2 = new HashMap<>();

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
            
            if (charMap2.get(c) == null) {
                charMap2.put(c, 1);
            }
            
            else {
                int count = charMap2.get(c);
                charMap2.put(c, count + 1); 
            }
        }
        
        for (Character c : charMap.keySet()) {
            if (!charMap.get(c).equals(charMap2.get(c))) {
                return false;
            }
        }
        
        return true;
    }
}