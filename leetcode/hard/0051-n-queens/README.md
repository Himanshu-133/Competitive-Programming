# N-Queens

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The  **n-queens**  puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

Given an integer `n`, return  *all distinct solutions to the  **n-queens puzzle***. You may return the answer in  **any order**.

Each solution contains a distinct board configuration of the n-queens' placement, where `'Q'` and `'.'` both indicate a queen and an empty space, respectively.

 

 **Example 1:** 

```
Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above

```

 **Example 2:** 

```
Input: n = 1
Output: [["Q"]]

```

 

 **Constraints:** 

- 1 <= n <= 9

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 81.19%)  
**Memory:** 46.9 MB (beats 15.01%)  
**Submitted:** 2026-08-27T19:37:43.335Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/n-queens/)