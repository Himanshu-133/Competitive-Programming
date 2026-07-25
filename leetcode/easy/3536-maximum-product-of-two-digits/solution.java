class Solution {
    public int maxProduct(int n) {
        List<Integer> sb=new ArrayList<>();
        while(n>0){
            int digit=n%10;
            sb.add(digit);
            n=n/10;
        }
        Collections.sort(sb);
        int m=sb.size();
        int res=sb.get(m-1)*sb.get(m-2);
        return res;
    }
}