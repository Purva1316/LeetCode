class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        //store frequency of every ele in num1
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       // If an element exists in the map with frequency > 0: Add it to the answer Decrease its frequency.
        List<Integer> list=new ArrayList<>();
        for(int i:nums2){
            if(map.getOrDefault(i,0)>0){
                list.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        //convert list into arr
        int ans[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}