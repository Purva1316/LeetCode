class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        //store all ele of 1st arr
        for(int i:nums1){
            set.add(i);
        }
        //traverse 2nd arr
        for(int i:nums2){
            if(set.contains(i)){
                ans.add(i);
            }
        }

        //convert set into array
        int res[]=new int[ans.size()];
        int i=0;
        for(int num:ans){
            res[i++]=num;
        }
        return res;
    }
}