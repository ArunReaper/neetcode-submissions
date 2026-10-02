class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        int maxCounter = 0;
        Arrays.sort(nums);
        
        int i = 0;
        int count = 0;
        while(i < nums.length - 1){
            int currNum = nums[i];
            if(currNum == nums[i + 1]){

            }
            else if(currNum + 1 == nums[i + 1]){
                count++;
            }else{
                count = 0;
            }
            i++;
            maxCounter = Math.max(maxCounter, count);
        }
        return maxCounter + 1;
        
    }
}
