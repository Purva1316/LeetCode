class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied=0;
        int n=customers.length;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];            }
        }
        int extra=0;
        //1st window ka sum
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
        }
        int maxExtra = extra;
        //slide window
        for(int i=minutes;i<n;i++){
            //add new ele 
            if(grumpy[i]==1){
                extra+=customers[i];
            }
            //remove old ele
            if(grumpy[i-minutes]==1){
                extra-=customers[i-minutes];
            }
            maxExtra=Math.max(maxExtra, extra);
        }
        return satisfied + maxExtra;
    }
}