class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<nums.length;i++){
            curSum+=nums[i]; //add sum
            maxSum=Math.max(curSum,maxSum);
            //egde case - written last bcoz if all no are -ve then it should atleast return 1 max no.
            if(curSum<0){   //if cursum becomes -ve so reset it
                curSum=0;
            }
        }
        return maxSum;
    }
}