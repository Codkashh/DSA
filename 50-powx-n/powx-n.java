class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        double answer=0;
        if(n<0){
            n = -n;
            x = 1/x;
            answer = x*myPow(x,n-1);
        } else if(n%2==0) {
            answer = myPow(x*x, n/2);
        } else{
            answer = x*myPow(x,n-1);
        }
        return answer;
    }
}