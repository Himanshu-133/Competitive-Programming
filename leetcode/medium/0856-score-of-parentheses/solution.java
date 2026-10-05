class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        int high=0,low=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                high++;
            }else{
                low++;
            }
        }
        count=Math.max(high,low);
        return count;
    }
}