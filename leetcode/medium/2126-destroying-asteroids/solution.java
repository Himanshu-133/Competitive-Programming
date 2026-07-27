class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long sum=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++){
            if(sum>=asteroids[i]){
                sum+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}