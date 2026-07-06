class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); //initially

        int cursum=0;
        int sum=0;
        int count=0;
        for(int i:nums){
            cursum += i;  //sum

            if(map.containsKey(cursum-k)){
                count+=map.get(cursum-k);
            }

            map.put(cursum,map.getOrDefault(cursum,0)+1);
        }
        return count;
    }
}