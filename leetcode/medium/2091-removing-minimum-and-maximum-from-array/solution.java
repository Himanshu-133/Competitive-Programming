class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        //int mid=n/2;
        int min=0,max=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        int left=Math.min(min,max);
        int right=Math.max(min,max);
        int a=right+1;
        int b=n-left;
        int c=left+1+n-right;
        return Math.min(a,Math.min(b,c));
    }
}