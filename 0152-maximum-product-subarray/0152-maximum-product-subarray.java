class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int leftProd=1;
        int rightProd = 1;
        int maxProd=nums[0];

        for(int i=0;i<n;i++){
            //if no is 0 use 1 to multiply
           leftProd= leftProd==0 ? 1 : leftProd;
            rightProd = rightProd==0 ? 1 : rightProd;
            //multiplication
            leftProd *= nums[i];
            rightProd *= nums[n-1-i]; //second last 

            //max prod
            maxProd=Math.max(maxProd,Math.max(leftProd,rightProd));
        }
        return maxProd;
    }
}