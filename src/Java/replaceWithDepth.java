package Java;

public class replaceWithDepth {
    public static void helper(TreeNode<Integer> root, int depth) {
		if(root == null) return;
		root.data = depth;
		depth = depth + 1;
		for(TreeNode<Integer> child: root.children) {
			helper(child, depth);
		}
	}
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
		helper(root, 0);
		
	}
}
