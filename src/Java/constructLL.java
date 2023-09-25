package Java;
class LinkedBst {
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
}
public class constructLL {
	public static LinkedBst constructHelper(BinaryTreeNode<Integer> root) {
		if(root == null) return new LinkedBst();
		LinkedBst pair = new LinkedBst();
		LinkedBst left = constructHelper(root.left);
		LinkedBst right = constructHelper(root.right);
		LinkedListNode<Integer> temp = new LinkedListNode<Integer>(root.data);
		if(left.tail != null) {
			left.tail.next = temp;
		}
		temp.next = right.head;
		if(left.head != null) {	
			pair.head = left.head;
		}else{
			pair.head = temp;
		}

		if(right.tail != null) {
			pair.tail = right.tail;
		}else{
			pair.tail = temp;
		}
		return pair;

	}	
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		return constructHelper(root).head;
	}
}