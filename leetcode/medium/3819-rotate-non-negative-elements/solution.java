class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int num:nums){
            if(num>=0){
                count++;
            }
        }
        if(count<=1){
            return nums;
        }
        k%=count;
        int idx=0;
        int[] pos=new int[count];
        for(int num:nums){
            if(num>=0){
                pos[idx++]=num;
            }
        }
        idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                nums[i]=pos[(idx+k)%count];
                idx++;
            }
        }
        return nums;
    }
}