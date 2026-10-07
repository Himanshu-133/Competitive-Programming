class Solution {
    Set<String> res= new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int l=0,r=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                l++;
            }else if(c==')'){
                if(l>0){
                    l--;
                }else{
                    r++;
                }
            }
        }
        backtrack(s,0,l,r,0,new StringBuilder());
        return new ArrayList<>(res);
    }
    private void backtrack(String s,int idx,int l,int r,int balance,StringBuilder current){
        if(idx==s.length()){
            if(l==0 && r==0 && balance==0){
                res.add(current.toString());
            }
            return;
        }
        char ch=s.charAt(idx);
        if(ch=='(' && l>0){
            backtrack(s,idx+1,l-1,r,balance,current);
        }
        if(ch==')' && r>0){
            backtrack(s,idx+1,l,r-1,balance,current);
        }
        current.append(ch);
        if(ch=='('){
            backtrack(s,idx+1,l,r,balance+1,current);
        }else if(ch==')'){
            if(balance>0)backtrack(s,idx+1,l,r,balance-1,current);
        }else{
            backtrack(s,idx+1,l,r,balance,current);
        }
        current.deleteCharAt(current.length()-1);
    }
}