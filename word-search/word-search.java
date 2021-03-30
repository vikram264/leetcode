class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        if(rows == 0) return false;
       
        int cols = board[0].length;
        visited = new boolean[rows][cols];
        
        for(int i = 0;i<rows;i++) {
            for(int j = 0;j<cols;j++) {
                if(board[i][j]==word.charAt(0) && search(i,j,board,word,0)) {
                    return true;
                }
            }
        }
        return false;
        
    }
    
    
    public boolean search(int row, int col, char[][] board, String word, int index) {
        
        if(word.length() == index) return true;
        
        if(row<0 || row > board.length - 1 || col<0 || col > board[0].length -1 || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }
        
        visited[row][col] = true;
        if(
            search(row+1,col,board,word,index+1) ||
            search(row-1,col,board,word,index+1) ||
            search(row,col+1,board,word,index+1) ||
            search(row,col-1,board,word,index+1) 
        ) {
            return true;
        }
        
        visited[row][col] = false;
        return false;
    }
}