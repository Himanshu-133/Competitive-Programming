class Solution {
    public int maxPower(String s) {
        if(s==null || s.length()==0)return 0;
        int count=1;
        int c=Integer.MIN_VALUE;
        char[] res=s.toCharArray();
        for(int i=1;i<res.length;i++){
            if(res[i-1]==res[i]){
                count++;
            }else{
                count=1;
            }
            c=Math.max(c,count);
        }
        return c;
    }
}