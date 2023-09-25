package Java;
public class isBst {
    public static int largest(BinaryTreeNode<Integer> root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(largest(root.left), largest(root.right)));
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

    public static isBstReturn improvedBsthelper(BinaryTreeNode<Integer> root) {
        if(root == null) {
            return new isBstReturn(Integer.MIN_VALUE,Integer.MAX_VALUE, true);
        }
        isBstReturn bstLeft = improvedBsthelper(root.left);
        isBstReturn bstRight = improvedBsthelper(root.right);
        int max = Math.max(root.data, Math.max(bstLeft.max, bstRight.max));
        int min = Math.min(root.data, Math.min(bstLeft.min, bstRight.min));
        boolean isBst = true;
        if(max > root.data || min < root.data) {
            isBst = false;
        } 
        isBst = isBst && bstLeft.isBst && bstRight.isBst;
        return new isBstReturn(max, min, isBst);
    }

    public static boolean isBstImproved(BinaryTreeNode<Integer> root) {
        isBstReturn a = new isBstReturn(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        isBstReturn b = improvedBsthelper(root);
        return b.isBst;
    }   


    public static void main(String...args) {

    }    
}
