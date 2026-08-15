class Solution {
    public int findPeakElement(int[] nums) {
        int maxindex=0;
       int max=nums[0];
        for(int i=0;i<=nums.length-1;i++) {
            if(nums[i]>max) {
            max=nums[i];
            maxindex=i;
            }
        }
        return maxindex;
            }
}