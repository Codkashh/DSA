class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        int curr = 1;
        int ans = 0;
        for(int i = 0;i<meetings.length;i++){
            if(curr<meetings[i][0]){
                ans+=(meetings[i][0]-curr);
            }
            curr = Math.max(curr,meetings[i][1]+1);
        }
        if(days>=curr) ans+=(days-curr+1);
        return ans;
    }
}