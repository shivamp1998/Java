package Java;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}
