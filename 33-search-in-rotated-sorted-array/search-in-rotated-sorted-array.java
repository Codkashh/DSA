class Solution {
    public int search(int[] nums, int target) {
        int startPoint = 0, endPoint = nums.length - 1;

        while (startPoint <= endPoint) {
            int mid = (startPoint + endPoint) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[startPoint] <= nums[mid]) {
                if (nums[startPoint] <= target && target < nums[mid]) {
                    endPoint = mid - 1;
                } else {
                    startPoint = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[endPoint]) {
                    startPoint = mid + 1;
                } else {
                    endPoint = mid - 1;
                }
            }
        }

        return -1;
    }
}