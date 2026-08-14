class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int ans=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'a']++;
            while(freq[s.charAt(j)-'a']>2){
                freq[s.charAt(i)-'a']--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans; 
    }
}