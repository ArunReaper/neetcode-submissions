class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> res = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++){
                int target = -(nums[i] + nums[j]);
                if(set.contains(target)){
                    int[] arr = new int[]{nums[i], nums[j], target};
                    Arrays.sort(arr);
                    res.add(Arrays.asList(arr[0], arr[1], arr[2])); 
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}
