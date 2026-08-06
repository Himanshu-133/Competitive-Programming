class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int temp=n;
        int prod=1;
        while(temp>0){
            int digit=temp%10;
            prod=prod*digit;
            temp=temp/10;
        }
        if(prod%t==0){
            return n;
        }else{
            n++;
        }
    }
    }
}