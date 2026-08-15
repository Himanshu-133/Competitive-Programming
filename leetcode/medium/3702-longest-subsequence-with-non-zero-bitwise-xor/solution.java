class Solution {
    public int longestSubsequence(int[] nums) {
        int a=0;
        int b=0;
        for(int x:nums){
            a^=x;
            if(x==0){
                b++;
            }
        }
        if(a!=0){
            return nums.length;
        }
        if(b==nums.length){
            return 0;
        }
        return nums.length-1;
    }
}