class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=1;i<nums.length;i=i+2){
            int ans=Math.min(nums[i],nums[i-1]);
            sum=sum+ans;
        }
        return sum;
    }
}