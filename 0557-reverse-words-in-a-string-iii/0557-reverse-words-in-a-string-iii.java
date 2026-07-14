class Solution {
    public static void reverse(char arr[], int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        char arr[]=s.toCharArray();

        int left=0;
        int right=0;

        while(right<arr.length){
            //increment right till whitespace
            if(arr[right]==' '){ //once whitespace is encountered
                reverse(arr,left,right-1); //call fun
                left=right+1; //move left
            }
            right++; 
        }
        //last word reverse
        reverse(arr,left,right-1);

        //return string
        return new String(arr);
    }
}