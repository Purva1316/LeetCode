class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cur=0;
        for(int i=0;i<k;i++){
            cur+=nums[i];
        }
        double maxx=cur;
        for(int i=1;i<=nums.length-k;i++){
            cur=cur-nums[i-1]+nums[i+k-1];
            if(cur>maxx){
                maxx=cur;
            }
        }
        return maxx/k;
    }
}