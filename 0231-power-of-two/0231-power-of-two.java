class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        //n & (n-1) will be 0 only for power of 2
        return (n & (n-1))==0;
    }
}