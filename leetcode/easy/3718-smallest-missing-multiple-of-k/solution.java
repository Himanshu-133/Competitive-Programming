class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> sb=new HashSet<>();
        for(int num:nums){
            sb.add(num);
        }
        int res=k;
        while(sb.contains(res)){
            res+=k;
        }
        return res;
    }
}