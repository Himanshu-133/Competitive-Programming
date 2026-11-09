class Solution {
    public int jump(int[] nums) {
        int count=0,end=0,f=0;
        for(int i=0;i<nums.length-1;i++){
            f=Math.max(f,nums[i]+i);
            if(i==end){
                count++;
                end=f;
            }
        }
        return count;
    }
}