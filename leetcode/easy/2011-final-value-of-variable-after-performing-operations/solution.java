class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String ch: operations){
            if(ch.equals("X--") || ch.equals("--X")){
                count--;
            }
            else{
                count++;
            }
        }
        return count;
    }
}