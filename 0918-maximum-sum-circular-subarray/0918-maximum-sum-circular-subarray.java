class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;

        int curMax=0;
        int maxSum=nums[0];
        int curMin=0;
        int minSum=nums[0];

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            //maxsubarray
            curMax=Math.max(n,curMax+n);
            maxSum=Math.max(maxSum,curMax);

            //min subarray
            curMin=Math.min(n,curMin + n);
            minSum=Math.min(curMin, minSum);

            total+=n;
        }
        //egde case - if all ele are -ve 
        if(maxSum < 0){
            return maxSum;
        }
        return Math.max(maxSum,total-minSum);
    }
}