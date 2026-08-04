class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> sb= new ArrayList<>();
        if(n<=3){
            return sb;
        }
        for(int i=2;i<=n/2;i++){
            int j=n-i;
            if(isprime(i) && isprime(j)){
                List<Integer> ab=new ArrayList<>();
                ab.add(i);
                ab.add(j);
                sb.add(ab);
            }
        }
        return sb;
    }
    private static boolean isprime(int a){
        if(a<2)return false;
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}