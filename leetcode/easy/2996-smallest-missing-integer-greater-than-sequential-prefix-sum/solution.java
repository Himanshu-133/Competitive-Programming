class Solution {
    public int missingInteger(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            //int sum=0;
            if(nums[i]==nums[i-1]+1){
                max+=nums[i];
            }else{
                break;
            }
        }
        int ans=max;
        while(true){
            boolean found=false;
            for(int num:nums){
                if(num==ans){
                    found=true;
                    break;
                }
            }
            if(!found){
                return ans;
            }
            ans++;
        }
        //return ans;
    }
}