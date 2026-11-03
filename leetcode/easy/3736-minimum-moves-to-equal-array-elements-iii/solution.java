class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int max=0;
        for(int n:nums){
            max=Math.max(n,max);
            sum+=n;
        }
        return (max*nums.length)-sum;
    }
}