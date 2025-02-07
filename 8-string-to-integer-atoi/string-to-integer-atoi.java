class Solution {
    public int myAtoi(String s) {
        int i=0;
        long answer=0;
        int sign=1;
        int n=s.length();
        while(i<n && s.charAt(i) == ' ')
        {
            i++;
        }
        if(i<n && (s.charAt(i)=='-' ||s.charAt(i)=='+')){
            sign= s.charAt(i)=='-'? -1:1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            answer=answer*10 + digit;
            
            if(answer*sign >Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(answer*sign <Integer.MIN_VALUE)return Integer.MIN_VALUE;

            i++;
        }
        return sign*(int)answer;

    }
}