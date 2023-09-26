public class lcaBinaryTree {
    public static BinaryTreeNode<Integer> lcaHelper(BinaryTreeNode<Integer> root, int a, int b) {
		if(root.data == a || root.data == b || root == null) return root;
		if(root.data > a && root.data > b) {
			return lcaHelper(root.left, a, b);
		}else if(root.data < a && root.data < b) {
			return lcaHelper(root.right, a, b);
		}else{
			return root;
		}
	}
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(lcaHelper(root,a,b) == null) return -1;
		else return lcaHelper(root, a, b).data;
	}
}
