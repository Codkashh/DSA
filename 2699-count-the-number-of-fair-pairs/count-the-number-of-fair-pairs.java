class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        // Sort the array to use two-pointer efficiently
        Arrays.sort(nums);

        // Count of pairs with sum ≤ upper MINUS pairs with sum < lower
        // This gives count of pairs such that lower ≤ sum ≤ upper
        return helper(nums, upper + 1) - helper(nums, lower);
    }

    // Helper method to count number of pairs (i, j) with 0 ≤ i < j < n
    // and nums[i] + nums[j] < target
    private long helper(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        long count = 0;

        // Two-pointer traversal to count valid pairs
        while (l < r) {
            int sum = nums[l] + nums[r];

            if (sum < target) {
                // Since nums is sorted and sum < target,
                // all pairs (l, l+1), (l, l+2), ..., (l, r) are valid
                count += (r - l);
                l++; // Move to next left element
            } else {
                // If sum ≥ target, decrease right pointer to reduce sum
                r--;
            }
        }

        return count;
    }
}