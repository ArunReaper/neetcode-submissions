class Solution {
    public int maxArea(int[] heights) {
        
        int i = 0, j = heights.length - 1;
        int maxArea = 0;

        while(i < j){
            int distance = j - i;
            int capacity = Math.min(heights[i], heights[j]);
            int area = distance * capacity;
            maxArea = Math.max(area, maxArea);
            if(heights[i] < heights[j]) i++;
            else j--;
        }
        return maxArea;
    }
}
