class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int depth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(depth>0){
                    sb.append(c);
                    //depth++;
                }
                depth++;
            }
            else{
                if(depth>1){
                    sb.append(c);
                }
                depth--;
            }
        }
        return sb.toString();
    }
}