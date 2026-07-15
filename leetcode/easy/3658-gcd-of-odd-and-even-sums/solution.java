class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum=0,osum=0;
        for(int i=1;i<=2*n;i=i+2){
            osum=osum+i;
        }
        for(int i=2;i<=2*n;i=i+2){
            esum=esum+i;
        }
        return gcd(esum,osum,n);
    }
    private int gcd(int e,int o,int n){
        for(int i=n;i>0;i--){
            if(e%i==0 && o%i==0){
                return i;
            }
        }
        return 1;
    }
}