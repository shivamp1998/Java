package Java;
public class largestBstInTree {
    public static int maximum(BinaryTreeNode<Integer> root, int max) {
		if(root == null) return Integer.MIN_VALUE;
		int left = maximum(root.left, max);
		int right = maximum(root.right, max);
		max = Math.max(root.data, Math.max(left, right));
		return max;
	}
	public static int minimum(BinaryTreeNode<Integer> root, int min) {
		if(root == null) return Integer.MAX_VALUE;
		int left = minimum(root.left, min);
		int right = minimum(root.right, min);
		min = Math.min(root.data, Math.min(left, right));
		return min;
	}
	public static boolean isBst(BinaryTreeNode<Integer> root) {
		if(root == null) return true;
		int max = maximum(root.left, Integer.MIN_VALUE);
		int min = minimum(root.right, Integer.MAX_VALUE);
		if(root.data < max || root.data > min) {
			return false;
		}
		return isBst(root.left) && isBst(root.right);
	
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		return 1 + Math.max(height(root.left), height(root.right));
	}

	public static int helper(BinaryTreeNode<Integer> root, int max) {
		if(root == null) return max;
		if(isBst(root)) {
			if(max < height(root)) max = height(root);
		}
		int left = helper(root.left, max);
		int right = helper(root.right,max);
		return Math.max(max, Math.max(left, right));
	}
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root == null) return 0;
		return helper(root, Integer.MIN_VALUE);

	}
}
