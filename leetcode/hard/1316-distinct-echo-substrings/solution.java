class Solution {
    public int distinctEchoSubstrings(String text) {
        Set<String> sb=new HashSet<>();
        int n=text.length();
        for(int i=0;i<n;i++){
            for(int j=1;i+2*j<=n;j++){
                String first=text.substring(i,i+j);
                String second=text.substring(i+j,i+2*j);
                if(first.equals(second)){
                    sb.add(first+second);
                }
            }
        }
        return sb.size();
    }
}