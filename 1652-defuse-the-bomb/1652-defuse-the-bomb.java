class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int ans[] = new int[n];
        //case 1
        if(k==0){
            return ans;
        }
        int start,end;
        if(k>0){
            start=1;
            end=k;
        }else{
            start=n+k; //k is positive
            end=n-1;
            k=-k; //make k positive
        }
        //first window sum
        int wSum=0;
        for(int i=start;i<=end;i++){
            wSum+=code[i];
        }
        //slide
        for(int i=0;i<n;i++){
            ans[i]=wSum;
            //remove outgoing ele
            wSum-=code[start%n];
            //move window
            start++;
            end++;
            //add incoming ele
            wSum+=code[end%n];
        }
        return ans;
    }
}