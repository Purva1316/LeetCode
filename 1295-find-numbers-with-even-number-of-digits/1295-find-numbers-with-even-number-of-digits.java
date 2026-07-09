class Solution {
    public int findNumbers(int[] nums) {
        int count=0;

        for(int num : nums){
            int digits=countDigits(num);
            if(digits%2==0){
                count++;
            }
        }
       return count;
    }

    public static int countDigits(int num){
        int digit=0;
        while(num>0){
            digit++;
            num /= 10;
        }
        return digit;
    }
}