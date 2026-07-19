class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n=s.length();
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+(s.charAt(i)=='1'?1:0);
        }
        int ones=prefix[n];
        boolean[] ans=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            int fixone=0;
            int[] p=new int[n];
            int q=0;
            boolean[] isone=new boolean[n];
            for(int j=0;j<n;j++){
                char c=str.charAt(j);
                if(c=='1'){
                    isone[j]=true;
                    fixone++;
                }else if(c=='?'){
                    p[q++]=j;
                }
            }
            int need=ones-fixone;
            if(need<0 || need>q){
                ans[i]=false;
                continue;
            }
            int start=q-need;
            for(int j=start;j<q;j++){
                isone[p[j]]=true;
            }
            boolean k=true;
            int count=0;
            for(int j=0;j<n;j++){
                if(isone[j])count++;
                if(count>prefix[j+1]){
                    k=false;
                    break;
                }
            }
            ans[i]=k;
        }
        return ans;
    }
}