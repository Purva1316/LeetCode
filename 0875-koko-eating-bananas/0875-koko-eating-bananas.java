class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int p:piles){
            right=Math.max(right,p);
        }

        while(left<right){
            int mid=left+(right-left)/2;
            int hr=0;
            for(int i: piles){
                hr+=(i+mid-1)/mid;
            }
            if(hr<=h){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}