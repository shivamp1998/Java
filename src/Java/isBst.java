public class isBst {
    public static int largest(BinaryTreeNode<Integer> root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(largest(root.left), largest(root.right)))
    }
    public static int smallest(BinaryTreeNode<Integer> root) {
        if(root == null) 
            return Integer.MIN_VALUE;
        return Math.min(root.data, Math.min(smallest(root.left), smallest(root.right)));
    }
    public static boolean isTreeBst(BinaryTreeNode<Integer> root) {
        if(root == null) return true;
        int max = largest(root.left);
        int min = smallest(root.right);
        
        if( max > root.data || min > root.data) {
            return false;
        }
        return isTreeBst(root.left) && isTreeBst(root.right);
        
    }
    public static void main(String...args) {

    }    
}
