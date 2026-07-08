class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int expSum = n*(n+1)/2;
        int actSum=0;
        for(int i : nums){
            actSum += i;
        }
        return expSum-actSum;
    }
}