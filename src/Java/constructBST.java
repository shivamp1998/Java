package Java;

public class constructBST {
    public static BinaryTreeNode<Integer> helper(int[] arr, int i, int j) {
        if(i > j) return null;
        if(i == j) return new BinaryTreeNode<>(arr[i]);
        // System.out.println(i + " " + j);
        int mid = (i+j) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = helper(arr, i, mid-1);
        root.right = helper(arr, mid + 1, j);
        return root;
    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
                return helper(arr, 0, arr.length - 1);
    }  
}
