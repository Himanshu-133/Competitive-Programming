class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int left=0;
        int count=0;
        String ans="";
        for(int right=0;right<n;right++){
            if(s.charAt(right)=='1'){
                count++;
            }
            while(count>k){
                if(s.charAt(left)=='1'){
                    count--;
                }
                left++;
            }
            if(count==k){
                while(s.charAt(left)=='0'){
                    left++;
                }
                String temp = s.substring(left, right + 1);
                if(ans.equals("") ||
                    temp.length() < ans.length() ||
                    (temp.length()==ans.length() && temp.compareTo(ans)<0)){
                    ans=temp;
                }
            }
        }
        return ans;
    }
}