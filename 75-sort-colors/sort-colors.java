class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int length = nums.length;

        for(int num : nums) {
            if(num == 0) {
                zeros++;
            } else if(num == 1) {
                ones++;
            }
        }

        for(int i = 0; i < zeros; ++i) {
            nums[i] = 0;
        }

        for(int j = zeros; j < zeros + ones; ++j) {
            nums[j] = 1;
        }

        for(int k = zeros + ones; k < length; ++k) {
            nums[k] = 2;
        }
    }
}