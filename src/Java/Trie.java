package Java;
class TrieNode {
    char data;
    boolean isTerminal;
    TrieNode children[];
    public TrieNode(char data) {
        this.data = data;
        this.isTerminal = false;
        this.children = new TrieNode[26];
    }
}
public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode('\0');
    }
    public void add(String word) {
        if(word.length() == 0) return;
        if(root.children[word.charAt(0) - 'a'] != null) {
            add(word.substring(1));
        }else{
            root.children[word.charAt(0)-'a'] = new TrieNode(word.charAt(0));
            if(word.length() == 1) {
                root.isTerminal = true;
            }
            
        }
    }
    public boolean search(String word) {
        return false;
    }
    public void remove(String word) {

    }
}
