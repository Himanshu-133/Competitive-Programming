class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] row : board) Arrays.fill(row,'.');
        nQueen(board,0,res);
        return res;

    }
    public void nQueen(char board[][], int row, List<List<String>>res){
        if(row==board.length){
            res.add(construct(board));
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board,row+1,res);
                board[row][j]='.';
            }
        }
    }
        public boolean isSafe(char[][] board, int row, int col){
            for(int i=row-1;i>=0;i--){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;
        }
    
    private List<String> construct(char[][] board){
        List<String> list=new ArrayList<>();
        for(char[] row:board) list.add(new String(row));
        return list;
    }
}