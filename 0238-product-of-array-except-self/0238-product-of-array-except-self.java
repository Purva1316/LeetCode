class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length]; //prefix to store prod of left ele
        int n=nums.length;

        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }

        int sufix=1;
        for(int i=n-1;i>=0;i--){
            ans[i] *= sufix;
            sufix *= nums[i];
        }
        return ans;
    }
}