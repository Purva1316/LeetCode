class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int max=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }else{
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}