package Java;

import java.util.*;
public class BinaryTreeUse {

    public static void print(BinaryTreeNode<Integer> root) {
        if(root!=null) {
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        }
    }
    public static int NumberOfLeafs(BinaryTreeNode<Integer> root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return NumberOfLeafs(root.left) + NumberOfLeafs(root.right);
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static boolean balancedTree(BinaryTreeNode<Integer> root) {
        if(root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left- right) > 1) return false;
        boolean isLeftBalanced = balancedTree(root.left);
        boolean isRightBalanced = balancedTree(root.right);
        return isLeftBalanced && isRightBalanced;
    }

    public static BalancedImproved imporvedBalanced(BinaryTreeNode<Integer> root) {
        if(root == null) {
            BalancedImproved ans = new BalancedImproved(0, true);
            return ans;
        }
        BalancedImproved left = imporvedBalanced(root.left);
        BalancedImproved right = imporvedBalanced(root.right);
        int height = 1 + Math.max(left.height, right.height);
        boolean isBal = true;
        if(Math.abs(left.height - right.height) > 1) {
            isBal = false;
        }
        if(!left.isbalanced || !right.isbalanced) {
            isBal = false;
        }
        BalancedImproved ans = new BalancedImproved(height, isBal);
        return ans;


    }

    

    public static BinaryTreeNode<Integer>  takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(data == -1) return null;
        BinaryTreeNode<Integer> rootData = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> left = takeInput();
        BinaryTreeNode<Integer> right = takeInput();
        rootData.left = left;
        rootData.right = right;
        return rootData;
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
 