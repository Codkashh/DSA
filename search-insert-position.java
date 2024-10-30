class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid,first,last;
        first = 0;
        last = nums.length;
        for(int i = 0; i<nums.length; i++){
            mid = first + (last-first)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                last = mid--;
            }
            else{
                first = mid++;
            }
        }
        return last;
    }
}