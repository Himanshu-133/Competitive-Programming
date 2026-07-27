class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=(nums[i]-1)*(nums[j]-1);
                res=Math.max(sum,res);
            }
        }
        return res;
    }
}