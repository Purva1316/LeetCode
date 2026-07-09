class Solution {
    public int thirdMax(int[] nums) {
        Long first=null;
        Long sec=null;
        Long third=null;

        for(int num : nums){
            if((first!=null && num==first) || (sec!=null && num==sec) || (third!=null && num==third)){
                continue;
            }

            if(first==null || num>first){
                third=sec;
                sec=first;
                first=(long)num;
            }else if(sec==null || num>sec){
                third=sec;
                sec=(long)num;
            }else if(third==null || num>third){
                third=(long)num;
            }
        }
        return third==null ? first.intValue() : third.intValue();
    }
}