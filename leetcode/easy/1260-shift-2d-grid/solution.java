class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> sb=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        int o=n*m;
        k%=o;
        int[][] res=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int oldidx=i*m+j;
                int newidx=(oldidx+k)%o;
                int newrow=newidx/m;
                int newcol=newidx%m;
                res[newrow][newcol]=grid[i][j];
            }
        }
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(res[i][j]);
            }
            sb.add(row);
        }
        return sb;
    }
}