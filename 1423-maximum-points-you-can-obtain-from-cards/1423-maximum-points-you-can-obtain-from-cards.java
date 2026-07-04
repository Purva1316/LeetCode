class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum=0;
        // Step 1: Calculate total sum
        for(int i=0;i<cardPoints.length;i++){
            totalSum+=cardPoints[i];
        }
        int n=cardPoints.length;
        int w=n-k; //window size
        if(w==0){
            return totalSum;  //Edge case: Take all cards
        }
        int wSum=0;
        // Step 3: First window sum
        for(int i=0;i<w;i++){
            wSum+=cardPoints[i];
        }
        int minSum=wSum;
        //step 4: slide window
        for(int i=1;i<=n-w;i++){
            wSum=wSum-cardPoints[i-1] + cardPoints[i+w-1];
            minSum=Math.min(minSum, wSum);
        }
        return totalSum-minSum; /// Step 5: Maximum score
    }
}