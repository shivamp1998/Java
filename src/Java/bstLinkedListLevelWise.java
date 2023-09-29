package Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bstLinkedListLevelWise {
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		if(root == null) return new ArrayList<>();
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		ArrayList<LinkedListNode<Integer>> list = new ArrayList<>();
		list.add(new LinkedListNode<Integer>(root.data));
		LinkedListNode<Integer> head = null, tail = null;
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> front = q.poll();
			if(front == null ) {
				if(q.isEmpty()) break;
				list.add(head);
				head = null;
				tail = null;
				q.add(null);
				continue;
			}
			if(front.left != null) {
				int data = front.left.data;
				q.add(front.left);
				LinkedListNode<Integer> temp = new LinkedListNode<>(data);
				if(head == null) {
					head = temp;
					tail = head;
				}else{
					tail.next = temp;
					tail = tail.next;
				}
			}
			if(front.right != null) {
				q.add(front.right);
				int data = front.right.data;
				LinkedListNode<Integer> temp = new LinkedListNode<>(data);
				if(head == null) {
					head = temp;
					tail = head;
				}else{
					tail.next = temp;
					tail = tail.next;
				}
			}
			 
			
		}
		return list;
	}
}
