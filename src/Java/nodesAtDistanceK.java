package Java;

public class nodesAtDistanceK {

    public static void distanceInDepth(BinaryTreeNode<Integer> root, int k) {
        if(k == 0) {
            System.out.println(root.data);
            return;
        }
        distanceInDepth(root.right, k-1);
        distanceInDepth(root.left, k-1);
    }
    public static int distanceFromK(BinaryTreeNode<Integer> root, int k, int target) {
        if(root == null) return -1;
        if(root.data == target) {
            distanceInDepth(root, k);
            return 0;
        }
        int ld = distanceFromK(root.left, k, target);
        if(ld != -1) {
            if(ld + 1 == k ) {
                System.out.println(root.data);
            }else{
                distanceInDepth(root.right, k - 2 - ld);
            }
            return ld + 1;
        }
        int rd = distanceFromK(root.right, k, target);
        if(rd != -1) {
            if(rd + 1 == k) {
                System.out.println(root.data);
            }else{
                distanceInDepth(root.left, k - 2 - rd);
            }
            return rd  + 1;
        }
        return -1;
    }

    public static void nodesDistanceK(BinaryTreeNode<Integer> root, int k, int target) {
        distanceFromK(root, k, target);
    }

    public static void main(String...args) {
        
    }
}
