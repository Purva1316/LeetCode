class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int curMax=0;
        int max=0;

        int curMin=0;
        int min=0;

        for(int i=0;i<nums.length;i++){
            int n=nums[i];

            curMax=Math.max(n, curMax+n);
            max=Math.max(max,curMax);

            curMin=Math.min(n,curMin+n);
            min=Math.min(min,curMin);
        }
        return Math.max(max,Math.abs(min));
    }
}