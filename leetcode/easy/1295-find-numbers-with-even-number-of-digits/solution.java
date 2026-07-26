class Solution {
    public int findNumbers(int[] nums) {
        int rescount=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int n=nums[i];
            while(n>0){
                int digit=n%10;
                count++;
                n=n/10;
            }
            if(count%2==0){
                rescount++;
            }
        }
        return rescount;
    }
}