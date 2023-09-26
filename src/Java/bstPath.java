package Java;

import java.util.ArrayList;

public class bstPath {
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		if(root == null) return null;
		if(root.data == data) {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(data);
			return temp;
		}
		if(data > root.data) {
			ArrayList<Integer> right = getPath(root.right, data);
			if(right == null) {
				return null;
			}else{
				right.add(root.data);
				return right;
			}
		}else{
			ArrayList<Integer> left = getPath(root.left, data);
			if(left == null) {
				return null;
			}else{
				left.add(root.data);
				return left;
			}
		}
	}
    public static void main(String...args) {
        
    }
}
