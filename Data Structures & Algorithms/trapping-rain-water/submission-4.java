class Solution {
    public int trap(int[] arr) {
        int i = 0,  j = arr.length - 1;
        int leftMax = arr[0], rightMax = arr[arr.length - 1];
        int total = 0;
        
        while(i < j){
          if(arr[i] <= arr[j]){
               if(leftMax > arr[i]){
                    total += leftMax - arr[i];
               }else{
                    leftMax = arr[i];
               }
               i++;
          }else{
               if(rightMax > arr[j]){
                    total += rightMax - arr[j];
               }else{
                    rightMax = arr[j];
               }
               j--;
          }
        }
        return total;
    }
}
