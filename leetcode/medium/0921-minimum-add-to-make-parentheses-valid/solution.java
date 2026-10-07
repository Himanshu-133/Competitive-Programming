class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        Stack<Character>sb=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                sb.push(ch);
            }else{
                if(!sb.isEmpty()){
                    sb.pop();
                }else{
                    ans++;
                }
            }
        }
        return ans+sb.size();
    }
}