class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        final int mod=1_000_000_007;
        long ans=1;
        long prev=-1;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(found){
                    ans=(ans*(i-prev))%mod;
                }else{
                    found=true;
                }
                prev=i;
            }
        }
        return found?(int)ans:0;
    }
}