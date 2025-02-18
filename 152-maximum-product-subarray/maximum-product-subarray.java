class Solution {
    public int maxProduct(int[] nums) {
        int l=1;
        int r=1;
        int answer = nums[0];
        for(int i=0; i<nums.length; i++){
            l = l == 0 ? 1 : l;
            r = r == 0 ? 1 : r;

            l *= nums[i];
            r *= nums[nums.length-1-i];

            answer = Math.max(answer,Math.max(l,r)); 
        }
        return answer;
    }
}