class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> sb=new HashMap<>();
        for(int num: nums){
            sb.put(num,sb.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer, Integer> entry:sb.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            if(freq%k==0){
                sum=sum+num*freq;
            }
        }
        return sum;
    }
}