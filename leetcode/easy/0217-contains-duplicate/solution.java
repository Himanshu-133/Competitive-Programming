class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>sb=new HashSet<>();
        for(int num: nums){
                if(!sb.add(num)){
                    return true;
                }
        }
        return false;
    }
}