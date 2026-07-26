class Solution {
    public int maximum69Number (int num) {
        char[] digits=String.valueOf(num).toCharArray();
        for(int i=0;i<digits.length;i++){
            if(digits[i]=='6'){
                digits[i]='9';
                break;
            }
        }
        int res=0;
        for(char digit:digits){
            res=res*10+(digit-'0');
        }
        return res;
    }
}