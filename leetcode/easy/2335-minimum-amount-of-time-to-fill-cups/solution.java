class Solution {
    public int fillCups(int[] amount) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<amount.length;i++){
            sum+=amount[i];
            max=Math.max(max,amount[i]);
        }
        return Math.max((sum+1)/2,max);
    }
}