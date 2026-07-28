class Solution {
    public int missingNumber(int[] nums) {
        //Using math
       /* int n=nums.length;

        int expSum = n*(n+1)/2;
        int actSum=0;
        for(int i : nums){
            actSum += i;
        }
        return expSum-actSum;*/

        //Using XOR operation
        //(XOR of 0-n) XOR (XOR of array ele)
        int xor=nums.length;
        for(int i=0;i<nums.length;i++){
            xor^=i;
            xor^=nums[i];
        }
        return xor;
    }
}