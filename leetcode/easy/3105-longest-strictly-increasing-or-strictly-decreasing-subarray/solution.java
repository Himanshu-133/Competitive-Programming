class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        int num=1;
        int rum=1;
        for(int i=1;i<nums.length;i++){
            //int num=0;
            if(nums[i]>nums[i-1]){
                num++;
                rum=1;
            }
            //int rum=0;
            else if(nums[i]<nums[i-1]){
                rum++;
                num=1;
            }else{
                rum=1;
                num=1;
            }
            count=Math.max(count,Math.max(rum,num));
        }
        return count;
    }
}