class Solution {
    public String defangIPaddr(String address) {
        Stack<Character> sb=new Stack<>();
        for(char ch:address.toCharArray()){
            if(ch!='.'){
                sb.push(ch);
            }else{
                char a=ch;
                sb.push('[');
                sb.push(a);
                sb.push(']');
            }
        }
        Collections.reverse(sb);
        StringBuilder ab=new StringBuilder();
        while (!sb.isEmpty()) {
            ab.append(sb.pop());
        }
        return ab.toString();
    }
}