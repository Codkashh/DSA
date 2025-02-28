class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String temp = strs[0];
        int tempLen = temp.length();
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
        while (tempLen > s.length() || !temp.equals(s.substring(0, tempLen))) {
                tempLen--;
                if (tempLen == 0) {
                    return "";
                }
                temp = temp.substring(0, tempLen);
            }
        }

        return temp;        
    }
}