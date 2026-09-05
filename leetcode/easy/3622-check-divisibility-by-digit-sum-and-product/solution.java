class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0,prod=1;
        while(org>0){
            int digit=org%10;
            sum=sum+digit;
            prod=prod*digit;
            org=org/10;
        }
        if((sum+prod)==org){
            return true;
        }
        return false;
    }
}