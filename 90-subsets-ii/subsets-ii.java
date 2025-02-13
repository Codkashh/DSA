class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> response = new ArrayList<>();
        response.add(new ArrayList<>());
        int s;
        int e = 0;
        for(int i=0; i<nums.length; i++){
            s = 0;
            if(i>0 && nums[i] == nums[i-1]){
                s = e + 1;
            }
            e = response.size() - 1;
            int n = response.size();
            for(int j = s; j<n; j++) {
                List<Integer> inside = new ArrayList<>(response.get(j));
                inside.add(nums[i]);
                response.add(inside);
            }
        }
        return response;
    }
}