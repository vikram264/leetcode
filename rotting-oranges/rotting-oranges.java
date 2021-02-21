class Solution {
    public int orangesRotting(int[][] grid) {
       int time = 0, total = 0, rotten = 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        Queue<Orange> queue = new LinkedList<>();
        for(int i = 0;i<rows;i++) {
            for(int j = 0;j<cols;j++) {
                if(grid[i][j]== 1 || grid[i][j]==2) total++;
                if(grid[i][j]==2) queue.offer(new Orange(i,j));
            }
        }
        
        if(total == rotten) return time;
        
        while(!queue.isEmpty() && rotten < total) {
            
            int size = queue.size();
            
            rotten = rotten + size;
            if(rotten == total) return time;
            time++;
            
            
            for(int i = 0;i<size;i++) {
                
                Orange orange = queue.poll();
                
                int row = orange.row;
                int col = orange.col;
                
                if(row - 1>=0 && grid[row-1][col] == 1) {
                    grid[row-1][col] = 2;
                    queue.offer(new Orange(row-1,col));
                }
                
                
                if(row + 1<grid.length && grid[row+1][col] == 1) {
                    grid[row+1][col] = 2;
                    queue.offer(new Orange(row+1,col));
                }
                
                
                if(col + 1<grid[0].length && grid[row][col+1] == 1) {
                    grid[row][col+1] = 2;
                    queue.offer(new Orange(row,col+1));
                }
                if(col - 1>=0 && grid[row][col-1] == 1) {
                    grid[row][col-1] = 2;
                    queue.offer(new Orange(row,col-1));
                }
                
                
            }
            
            
            
        }
        
        return -1;
        
        
    }
}


class Orange {
    int row;
    int col;
    
    Orange(int row, int col) {
        this.row = row;
        this.col = col;
    }
}