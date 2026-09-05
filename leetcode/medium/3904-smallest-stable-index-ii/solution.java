class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n];
        res[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            res[i]=Math.min(nums[i],res[i+1]);
        }
        int resM=nums[0];
        for(int i=0;i<n;i++){
            resM=Math.max(resM,nums[i]);
            if(resM-res[i]<=k){
                return i;
            }
        }
        return -1;
    }
}