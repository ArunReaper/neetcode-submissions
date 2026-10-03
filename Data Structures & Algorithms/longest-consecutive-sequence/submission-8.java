class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxCount = 0;
        for(int i : nums) set.add(i);

        for(int i : nums){
            int count = 0, currNum = i;
            if(set.contains(i - 1)) continue;
            while(set.contains(currNum)){
                currNum++;
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
