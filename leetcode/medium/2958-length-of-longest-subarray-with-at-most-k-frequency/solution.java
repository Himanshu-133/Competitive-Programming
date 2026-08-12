class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> sb=new HashMap<>();
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            sb.put(nums[right],sb.getOrDefault(nums[right],0)+1);
            while(sb.get(nums[right])>k){
                sb.put(nums[left],sb.get(nums[left])-1);
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}