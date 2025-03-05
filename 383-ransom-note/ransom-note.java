class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        int [] alphabets_count = new int[26];
        for(char c : magazine.toCharArray()) {
            alphabets_count[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(alphabets_count[c-'a'] == 0) return false;
            alphabets_count[c-'a']--;
        }
        return true;

    }
}