class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> sb=new Stack<>();
        sb.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='('){
                sb.push(0);
            }else{
                int inner=sb.pop();
                if(inner==0){
                    sb.push(sb.pop()+1);
                }else{
                    sb.push(sb.pop()+2*inner);
                }
            }
        }
        return sb.pop();
    }
}