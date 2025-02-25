class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        int left = 0;
        int right = word.length-1;

        while(left < right) {
            String temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }

        StringBuilder result = new StringBuilder();
        for(String words : word) {
            if(!words.isEmpty()){
                if(result.length() > 0) {
                    result.append(" ");
                }
                result.append(words);
            }
        }
        return result.toString();
    }
}