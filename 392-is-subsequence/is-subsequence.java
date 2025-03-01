class Solution {
    public boolean isSubsequence(String s, String t) {
        int newS = 0;
        int newT = 0;
        while(newS < s.length() && newT < t.length()){
            if(s.charAt(newS) == t.charAt(newT)) {
                newS++;
            }
            newT++;
        }
        return newS == s.length();
    }
}