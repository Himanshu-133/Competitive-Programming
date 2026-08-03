class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long left=1;
        long right=2_000_000_000L;
        while(left<right){
            long mid=left+(right-left)/2;
            long count=mid/a+mid/b+mid/c-mid/lcm(a,b)-mid/lcm(b,c)-mid/lcm(a,c)+mid/lcm(lcm(a,b),c);
            if(count>=n){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return (int)left;
    }
    private long gcd(long a,long b){
        while(b!=0){
            long temp=a%b;
            a=b;
            b=temp;
        }
        return (int)a;
    }
    private long lcm(long a, long b){
        return (int)a/gcd(a,b)*b;
    }
}