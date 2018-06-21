class Solution {
    public char findTheDifference(String s, String t) {
        int totalS = 0, totalT = 0;
        
        // total ascii for string s
        for (int i = 0; i < s.length(); i++){
            totalS += (int) s.charAt(i);
        }
        
        // total ascii for string t
        for (int i = 0; i < t.length(); i++){
            totalT += (int) t.charAt(i);
        }
        
        // subtract the new string from the old string to get the new added char
        return (char) (totalT - totalS);
    }
}