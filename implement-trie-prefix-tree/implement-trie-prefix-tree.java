class Trie {
    
    class TrieNode {
        boolean isWord;
        TrieNode child[] = new TrieNode[26];
    }

    /** Initialize your data structure here. */
    TrieNode root = null;
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode parent = root;
        for(char c: word.toCharArray()) {
            int i = c - 'a';
            
            if(parent.child[i] == null) {
                parent.child[i] = new TrieNode();
            }
            parent = parent.child[i];
        }
        parent.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode parent = root;
        for(char c: word.toCharArray()) {
            int i = c - 'a';
            
            if(parent.child[i] == null) {
               return false;
            }
            parent = parent.child[i];
        }
       return parent.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode parent = root;
        for(char c: prefix.toCharArray()) {
            int i = c - 'a';
            
            if(parent.child[i] == null) {
               return false;
            }
            parent = parent.child[i];
        }
       return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */