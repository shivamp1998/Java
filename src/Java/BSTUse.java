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
    public static BinaryTreeNode<Integer> sortedArrayHelper(int[] arr, int n, int i, int j) {
        if(i > j) return null;
        int mid = (i + j)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
        root.left = sortedArrayHelper(arr, n, i, mid-1);
        root.right = sortedArrayHelper(arr, n, mid+1, j);
        return root;
    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        BinaryTreeNode<Integer> root = sortedArrayHelper(arr, n, 0, arr.length-1);
        return root;
    }

    public static isBstReturn isBstImprovved(BinaryTreeNode<Integer> root) {
        if(root == null) {
            return new isBstReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }
        isBstReturn left = isBstImprovved(root.left);
        isBstReturn right = isBstImprovved(root.right);

        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));
        
        boolean isBst = true;
        if(left.max >= root.data) {
            isBst = false;
        }
        if(right.min < root.data) {
            isBst = false;
        }
        if(!right.isBst) {
            isBst = false;
        }

        if(!left.isBst) {
            isBst = false;
        }
        return new isBstReturn(max, min, isBst);
        
    }

    public static boolean isBstMaxImproved(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
        if(root == null) return true;
        
        if(root.data > minRange && root.data < maxRange) {
            return isBstMaxImproved(root.left, minRange, root.data-1) || isBstMaxImproved(root, root.data, maxRange);
        }else return false;

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
