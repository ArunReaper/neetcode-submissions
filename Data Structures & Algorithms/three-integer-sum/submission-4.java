class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        Arrays.sort(nums);
        while(i < nums.length){
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                int target = nums[i] + nums[j] + nums[k];
                if(target == 0){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    int currJ = nums[j];
                    int currK = nums[k];
                    while(j < nums.length && nums[j] == currJ) j++;
                    while(k > -1 && nums[k] == currK) k--;
                }else if(target > 0){
                    k--;
                }else{
                    j++;
                }
            }
            int currI = nums[i];
            while(i < nums.length && nums[i] == currI) i++;
        }
        return res;
    }
}
