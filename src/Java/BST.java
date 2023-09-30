package Java;
public class BST {
    private BinaryTreeNode<Integer> root;
    private int size = 0;

    public BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return new BinaryTreeNode<>(data);
        if (data > root.data) {
            root.right = insertHelper(root.right, data);
        } else {
            root.left = insertHelper(root.left, data);
        }
        return root;
    }

    public void insert(int data) {
        // Implement the insert() function
        root = insertHelper(root, data);
        return;
    }

    public int minimum(BinaryTreeNode<Integer> root, int min) {
        if (root == null)
            return Integer.MAX_VALUE;
        if (root.data < min)
            min = root.data;
        int leftMin = minimum(root.left, min);
        int rightMin = minimum(root.right, min);
        return Math.min(min, Math.min(leftMin, rightMin));
    }

    public BinaryTreeNode<Integer> removeHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return null;
        if (root.data == data) {
            if (root.left != null && root.right != null) {
                int min = minimum(root.right, Integer.MAX_VALUE);
                root.data = min;
                root.right = removeHelper(root.right, min);
                return root;
            } else if (root.left != null) {
                return root.left;
            } else {
                return root.right;
            }
        } else if (root.data > data) {
            return removeHelper(root.left, data);
        } else {
            return removeHelper(root.right, data);
        }
    }

    public void remove(int data) {
        // Implement the remove() function
        root = removeHelper(root, data);
        return;
    }

    public void printTreeHelper(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + ":" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R" + ":" + root.right.data);
        }
        System.out.println();
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }

    public void printTree() {
        // Implement the printTree() function
        printTreeHelper(root);
    }

    public boolean searchHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return false;
        if (root.data == data)
            return true;
        return searchHelper(root.left, data) || searchHelper(root.right, data);
    }

    public boolean search(int data) {
        // Implement the search() function
        return searchHelper(root, data);
    }

}