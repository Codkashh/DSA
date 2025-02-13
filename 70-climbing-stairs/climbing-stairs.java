class Solution {
    public int climbStairs(int n) {
        int next=1;
        int prev=0;
        for(int i=0;i<n;i++){
            int temp=next;
            next=prev+next;
            prev=temp;
        }
        return (next);
    }
}