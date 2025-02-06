class Solution {
    public void reverseString(char[] s) {
        int rightEnd = s.length-1;
        int leftEnd = 0;
        while(leftEnd<rightEnd){
            char temp = s[leftEnd];
            s[leftEnd] = s[rightEnd];
            s[rightEnd] = temp;
            leftEnd++;
            rightEnd--; 
        }

    }
}