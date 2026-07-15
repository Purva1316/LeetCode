class Solution {
    public boolean detectCapitalUse(String word) {
        int upper=0;
        for(char ch: word.toCharArray()){
            if(ch >= 'A' && ch<='Z'){
                upper++;
            }
        }
        if(upper==word.length()){
            return true;
        }
        if(upper==0){
            return true;
        }
        if(upper==1 && word.charAt(0) >= 'A' && word.charAt(0)<='Z'){
            return true;
        }
        return false;
    }
}