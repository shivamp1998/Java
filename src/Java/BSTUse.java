package Java;
import java.util.*;


public class BSTUse {
    public static BinaryTreeNode<Integer> takeInput() {
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(sc.nextInt());
        
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode<Integer> node = q.poll();
            int leftChild = sc.nextInt();
            int rightChild = sc.nextInt();
            if (leftChild != -1) {
                node.left = new BinaryTreeNode<Integer>(leftChild);
                q.add(node.left);
            }
            if (rightChild != -1) {
                node.right = new BinaryTreeNode<Integer>(rightChild);
                q.add(node.right);
            }
        }
        return root;
    }
    public static void print(BinaryTreeNode<Integer> root) {
        if (root != null) {
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        }
    }

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){

        if(root == null) return;
        elementsInRangeK1K2(root.left, k1, k2);
        if(root.data >= k1 && root.data <= k2) {
            System.out.println(root.data);
        }
        elementsInRangeK1K2(root.right, k1, k2);
    }
}
