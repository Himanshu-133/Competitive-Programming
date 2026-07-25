class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> sb=new HashSet<>();
        for(int i=nums.size()-1;i>0;i--){
            int num=nums.get(i);
            if(num<=k){
                sb.add(num);
            }
            if(sb.size()==k)return nums.size()-i;
        }
        return nums.size();
    }
}