class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int lsum=0,rsum=0;
        int lq=0,rq=0;
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                lq++;
            }else{
                lsum+=num.charAt(i)-'0';
            }
        }
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                rq++;
            }else{
                rsum+=num.charAt(i)-'0';
            }
        }
        if((lq+rq)%2!=0)return true;
        int diff=((rq-lq)/2)*9;
        return lsum-rsum!=diff;
    }
}