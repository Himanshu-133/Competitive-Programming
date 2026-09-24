class Solution {
    public int smallestIndex(int[] nums) {
        int i=0;
        while(i<nums.length){
            int n=nums[i];
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit;
                n=n/10;
            }
            if(i==sum){
                return i;
            }
            i++;
        }
        return -1;
    }
}