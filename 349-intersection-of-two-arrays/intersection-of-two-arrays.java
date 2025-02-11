class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //using Hashset--
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> finalResult = new HashSet<>();

        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                finalResult.add(i);
            }
        }

        int res[] = new int[finalResult.size()];

        int j=0;
        
        for(int i:finalResult){
            res[j++] = i;
        }

        return res;
    }
}