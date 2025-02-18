class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans,1);
        int current = 1;
        for(int i = 0; i < n; i++){
            ans[i] *= current;
            current *= nums[i];
        }
        current = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= current;
            current *= nums[i];
        }

        return ans;
    }
}