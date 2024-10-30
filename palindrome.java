class Solution {
    public boolean isPalindrome(int x) {
        int num = 0;
        int y = x;
        while(y>0){
            num = num*10 + y%10;
            y = y/10;
        }
        if(x == num){
            return true;
        }
        else 
            return false;
    }
}