class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for(int x:nums1){
            if(x%2==1){
                min=Math.min(min,x);
            }
        }
        if(min==Integer.MAX_VALUE)return true;
        for(int x:nums1){
            if(x%2==0 && x<min){
                return false;
            }
        }
        return true;
    }
}