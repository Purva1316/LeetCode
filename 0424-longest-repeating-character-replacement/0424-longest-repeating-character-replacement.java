class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int left=0;
        int maxFreq=0;
        int maxWind=0;

        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++; //update fre of current char
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);  //calculate max fre

            int wLength=right-left+1;  //window size
            if(wLength-maxFreq>k){   //char to change > k
            //shrink wondow size
                freq[s.charAt(left)-'A']--;   //freq decrease current char
                left++;   //increment left
            }
            wLength=right-left+1;  // 
            maxWind=Math.max(maxWind,wLength);
        }
        return maxWind;
    }
}