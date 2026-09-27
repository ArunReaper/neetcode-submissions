class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res.length; j++){
                if(i!=j) res[i] *= nums[j];
            }
        }
        return res;
    }
}  
