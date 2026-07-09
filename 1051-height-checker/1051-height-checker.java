class Solution {
    public int heightChecker(int[] heights) {
        int frq[]=new int[101]; //array size is small
        for(int h:heights){
            frq[h]++;
        }
        int count=0;
        int curHeight=1;
        for(int i=0;i<heights.length;i++){
            while(frq[curHeight] == 0){
                curHeight++;
            }
            if(heights[i]!=curHeight){
                count++;
            }
            frq[curHeight]--;
        }
        return count;
    }
}