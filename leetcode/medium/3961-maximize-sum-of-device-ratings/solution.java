class Solution {
    public long maxRatings(int[][] units) {
        int n=units[0].length;
        if(n==1){
            long sum=0;
            for(int[] device: units){
                sum+=device[0];
            }
            return sum;
        }
        long ans=0;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int[] device: units){
            Arrays.sort(device);
            ans+=device[1];
            min1=Math.min(min1,device[0]);
            min2=Math.min(min2,device[1]);
        }
        return ans-(min2-min1);
    }
}