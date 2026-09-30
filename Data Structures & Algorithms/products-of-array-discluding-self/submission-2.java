class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        int p = 1;
        for(int i = 0; i < nums.length; i++){
            prefix[i] = p;
            p *= nums[i];
        }

        int s = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            suffix[i] = s;
            s *= nums[i];
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}  
