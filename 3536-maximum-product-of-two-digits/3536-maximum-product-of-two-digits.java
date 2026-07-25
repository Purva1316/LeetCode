class Solution {
    public int maxProduct(int n) {
        int first=n%10;
        n/=10;
        int sec=n%10;
        n/=10;
        if(sec>first){
            int temp=first;
            first=sec;
            sec=temp;
        }

        while(n>0){
            int a=n%10;
            n/=10;

            if(a>first){
                sec=first;
                first=a;
            }else if(a>sec){
                sec=a;
            }
        }
        return first*sec;
    }


}