class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int curWater=(Math.min(height[left],height[right])*(right-left));
            water=Math.max(water,curWater);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return water;
    }
}