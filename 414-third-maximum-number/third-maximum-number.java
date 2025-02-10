class Solution {
    public int thirdMax(int[] nums) {
        Integer maxFirst = null;
        Integer maxSecond = null;
        Integer maxThird = null;
        for(Integer n:nums){
            if(n.equals(maxFirst) || n.equals(maxSecond) || n.equals(maxThird)){
                continue;
            }
            if(maxFirst == null || n>maxFirst){
                maxThird = maxSecond;
                maxSecond = maxFirst;
                maxFirst = n;
            } else if(maxSecond == null || n>maxSecond){
                maxThird = maxSecond;
                maxSecond = n;
            } else if(maxThird == null || n>maxThird){
                maxThird = n;
            }
        }
        return maxThird == null ? maxFirst : maxThird;
    }
}