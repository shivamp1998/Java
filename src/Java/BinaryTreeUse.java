package Java;

public class BinaryTreeUse {

    public static void print(BinaryTreeNode<Integer> root) {
        if(root!=null) {
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        }
    }
    public static void main(String...args) {
        BinaryTreeNode<Integer> root  = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        root.left = rootLeft;
        root.right = rootRight;
        BinaryTreeNode<Integer> twoRootRight = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> twoRootLeft = new BinaryTreeNode<>(5);
        rootLeft.right = twoRootRight;
        rootRight.left = twoRootLeft;
        print(root);     
    }
}
