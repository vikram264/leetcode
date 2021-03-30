class Solution {
    
    
    
    class TrieNode {
        String  word;
        TrieNode[] child = new TrieNode[26];
    }
    
    
    public TrieNode buildTrie(String[] words) {
        
        TrieNode root = new TrieNode();
        for(String word : words) {
            TrieNode parent = root;
            for(char c : word.toCharArray()) {
                int i = c - 'a';
                if(parent.child[i] == null) {
                    parent.child[i] = new TrieNode();
                }
                parent = parent.child[i];
                
            }
            parent.word = word;
        }
        
        return root;
        
        
        
    }
    public List<String> findWords(char[][] board, String[] words) {
            int rows = board.length;
            int cols = board[0].length;
            TrieNode root = buildTrie(words);
            List<String> result = new ArrayList<>();
            for(int i = 0;i<rows;i++) {
                for(int j = 0;j<cols;j++) {
                    search(root,i,j,board,result);
                }
            }
        
            return result;

    }
    
    
    
    public void search(TrieNode node, int row, int col,char[][] board,List<String> results) {
       
        char c = board[row][col];
        if(c == '*' || node.child[c-'a'] == null)  return;
        node = node.child[c-'a'];
        
        if(node.word!=null)  {
            results.add(node.word);
            node.word = null;
        }
        
        
        board[row][col] = '*';
        
        if(row>0) search(node,row-1,col,board,results);
        if(row<board.length-1) search(node,row+1,col,board,results);
        if(col>0) search(node,row,col-1,board,results);
        if(col<board[0].length-1) search(node,row,col+1,board,results);
        
        
        board[row][col] = c;
        
            
    }
}