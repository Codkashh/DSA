class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        while(leftPointer<rightPointer){
            int total = numbers[leftPointer] + numbers[rightPointer];
            if(target == total){
                return new int[]{leftPointer + 1, rightPointer + 1};
            } else if(total > target){
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        return new int[]{-1,1};
    }
}