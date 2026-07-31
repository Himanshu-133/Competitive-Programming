class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int ans=0,count=0,cost=1;
        for(int i=25;i>=0;i--){
            if(freq[i]==0)break;
            ans+=freq[i]*cost;
            count++;
            if(count%8==0){
                cost++;
            }
        }
        return ans;
    }
}