class Solution {
    public void solve(char[][] board) {
       if(board.length == 0) return;
        int rows = board.length;
        int cols = board[0].length;
        
        
        for(int i = 0;i<rows;i++) {
            if(board[i][0] == 'O') boundaryDFS(board,i,0);
            if(board[i][cols-1]=='O') boundaryDFS(board,i,cols-1);
        }
        
        for(int j = 0;j<cols;j++) {
            if(board[0][j] == 'O') boundaryDFS(board,0,j);
            if(board[rows-1][j]=='O') boundaryDFS(board,rows-1,j);
        }
        
        
        for(int i = 0;i<rows;i++) {
            for(int j = 0;j<cols;j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if(board[i][j] == '*') {
                     board[i][j] = 'O';
                }
            }
        }
    }
    
    
    public void boundaryDFS(char[][] board,int row,int col) {
        if(row<0 || row> board.length - 1|| col<0 || col>board[0].length-1 || board[row][col]!='O') return;
  
         board[row][col] = '*';
        
         boundaryDFS(board,row+1,col);
         boundaryDFS(board,row-1,col);
         boundaryDFS(board,row,col+1); 
         boundaryDFS(board,row,col-1);
    }
    
}