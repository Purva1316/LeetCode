class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindow=Integer.MAX_VALUE;
        int cursum=0;
        int low=0;
        int high=0;

        while(high<nums.length){
            cursum+=nums[high];
            high++;

            while(cursum>=target){
                int curwindow=high-low;
                minWindow=Math.min(minWindow,curwindow);
                cursum-=nums[low];
                low++;
            }
        }
        return minWindow==Integer.MAX_VALUE? 0 : minWindow; 
    }
}