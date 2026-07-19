class Solution {
    public boolean canReach(int[] start, int[] target) {
        int startp=(start[0]+start[1])%2;
        int targetp=(target[0]+target[1])%2;
        return startp==targetp;
    }
}