package Java;

import java.util.*;


class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;
}

public class checkIdenticalTree {
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
		boolean ans = true;
		if(root1.data != root2.data) ans =  false;
		if(root1.children.size() != root2.children.size()) ans =  false; 
		for(int i=0; i<root1.children.size(); i++) {
			ans = ans && checkIdentical(root1.children.get(i), root2.children.get(i));
		}
		return ans;
	}
}
