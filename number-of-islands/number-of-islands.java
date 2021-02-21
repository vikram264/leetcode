class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        int islands = 0;
        for(int i = 0;i<rows;i++) {
            for(int j = 0;j<cols;j++) {
                if(grid[i][j]=='1') {
                    islands++;
                    bfs(grid,i,j);
                }
            }
        }
        
        return islands;
        
    }
    
    
    public void bfs(char[][] grid, int i , int j) {
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(i,j));
        grid[i][j] = 0;
        
        
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            
            int row = node.row;
            int col = node.col;
            
            
            if(row-1>=0 && grid[row-1][col] == '1') {
                grid[row-1][col] = '0';
                queue.offer(new Node(row-1,col));
            }
            
            
            if(row+1<grid.length && grid[row+1][col] == '1') {
                grid[row+1][col] = '0';
                queue.offer(new Node(row+1,col));
            }
            
            
            if(col-1>=0 && grid[row][col-1] == '1') {
                grid[row][col-1]= '0';
                queue.offer(new Node(row,col-1));
            }
            
            if(col+1<grid[0].length && grid[row][col+1] == '1') {
                grid[row][col+1] = '0';
                queue.offer(new Node(row,col+1));
            }
            
        }
    }
}





class Node {
    
    
    int row;
    int col;
    
    
    Node(int row, int col) {
        this.row = row;
        this.col = col;
    }
}