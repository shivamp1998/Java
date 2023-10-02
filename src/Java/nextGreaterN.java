package Java;

import java.util.ArrayList;

class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
}

public class nextGreaterN {
     
	public static TreeNode<Integer> helper(TreeNode<Integer> root, int n, TreeNode<Integer> curr) {
		if(root == null) return null;
		if(root.data > n && root.data <= curr.data) {
			curr = root;
		}
		for(int i=0; i<root.children.size(); i++) {
			curr = helper(root.children.get(i), n, curr);
		} 
		return curr;
	}
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
		return helper(root, n, new TreeNode<Integer>(Integer.MAX_VALUE));
	}
}
