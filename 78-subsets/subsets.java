class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> response = new ArrayList<>();
       response.add(new ArrayList<>());
       for(int num:nums){
            int n = response.size();
            for(int i=0; i<n; ++i){
                List<Integer> current = new ArrayList<>(response.get(i));
                current.add(num);
                response.add(current);
            }
       }
       return response; 
    }
}