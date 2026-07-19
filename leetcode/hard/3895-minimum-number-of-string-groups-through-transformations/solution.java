class Solution {
    public int minimumGroups(String[] words) {
        HashSet<String> set=new HashSet<>();
        for(String w: words){
            int n =w.length();
            StringBuilder a=new StringBuilder();
            StringBuilder b=new StringBuilder();
            for(int i=0;i<n;i++){
                if(i%2==0){
                    a.append(w.charAt(i));
                }else{
                    b.append(w.charAt(i));
                }
            }
            String c=minr(a.toString());
            String d=minr(b.toString());
            set.add(c+"#"+d);
        }
        return set.size();
    }
    private String minr(String s){
        int n=s.length();
        if(n<=1)return s;
        String ss=s+s;
        int i=0,j=1,k=0;
        while(i<n && j<n && k<n){
            char a=ss.charAt(i+k);
            char b=ss.charAt(j+k);
            if(a==b){
                k++;
            }else{
                if(a>b)i=i+k+1;
                else j=j+k+1;
                if(i==j)j++;
                k=0;
            }
        }
        int idx=Math.min(i,j);
        return ss.substring(idx,idx+n);
    }
}