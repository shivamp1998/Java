package Java;

import java.util.HashSet;

public class twoSumBst {
    public static void  helper(BinaryTreeNode<Integer> root, int s, HashSet<Integer> h) {
		if(root == null) return;
		helper(root.left, s, h);
		if(h.contains(s - root.data)) {
			int k = s - root.data;
			System.out.println(k+ " " + root.data );
		}else{
			h.add(root.data);
		}
		helper(root.right, s,h);
	}
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
		HashSet<Integer> h = new HashSet<>();
		helper(root, s, h);
	}
}
