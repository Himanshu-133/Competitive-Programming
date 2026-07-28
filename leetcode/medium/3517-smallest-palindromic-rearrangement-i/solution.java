class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder first=new StringBuilder();
        StringBuilder middle=new StringBuilder();
        for(int i=0;i<26;i++){
            while(freq[i]>=2){
                first.append((char)('a'+i));
                freq[i]-=2;
            }
            if(freq[i]==1){
                middle.append((char)('a'+i));
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(first);
        sb.append(middle);
        sb.append(new StringBuilder(first).reverse());
        return sb.toString();
    }
}