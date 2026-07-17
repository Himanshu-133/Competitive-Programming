class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer>sb=new HashSet<>();
        for(int i=1;i<=bound;i*=x){
            for(int j=1;j+i<=bound;j*=y){
                sb.add(i+j);
                if(y==1){
                    break;
                }
            }
            if(x==1){
                break;
            }
        }
        return new ArrayList<>(sb);
    }
}