class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] rem=new int[3];
        int n=stones.length;
        //if(n==1 || n==0)return false;
        for(int num: stones){
            rem[num%3]++;
        }
        int a= rem[0];
        int b=rem[1];
        int c=rem[2];
        if(a%2==0){
            return b>0 && c>0;
        }
        return Math.abs(b-c)>2;
    }
}