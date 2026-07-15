class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String sb:words){
            if(sb.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}