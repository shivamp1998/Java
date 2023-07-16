package Java;

public class diameterOfBinaryTree {
    
    public static int height(BinaryTreeNode<Integer> root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameterOfBinaryTreeCalc(BinaryTreeNode<Integer> root) {
        if(root == null) return 0;
        int leftDiameter = diameterOfBinaryTreeCalc(root.left);
        int rightDiameter = diameterOfBinaryTreeCalc(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int dia = leftHeight + rightHeight;
        return Math.max(dia, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String...args) {
        
    }    
}
