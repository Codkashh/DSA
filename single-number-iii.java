import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        Arrays.sort(nums);
        int index = 0;
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                result[index++] = nums[i];
                if (index == 2) break;
            } else {
                i++;  // Skip the next number as it's a duplicate
            }
        }
        
        // Handle the last element separately
        if (index < 2) {
            result[index] = nums[n - 1];
        }
        
        return result;
    }
}