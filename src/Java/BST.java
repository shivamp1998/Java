package Java;
import java.util.*;
public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    public boolean isPresentHelper(BinaryTreeNode<Integer> root, int x) {
        if(root == null) return false;
        if(root.data == x) return true;
        return isPresentHelper(root.left, x) || isPresentHelper(root, x);
    }
    public boolean isPresent(int x) {
        return false;
    }

    public void insert( int x) {
        return;
    }

    public boolean deleted( int x ) {
        return false;
    }

    public int size() {
        return 0;
    }

    public void printTreeHelper(BinaryTreeNode<Integer> root) {
        if(root == null) return;
        printTreeHelper(root.left);
        System.out.println(root.data);
        printTreeHelper(root.right);
    } 

    public void printTree() {
        printTreeHelper(root);
    }
    

}
