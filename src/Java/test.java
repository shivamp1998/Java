package Java;

public class test {
	public static LinkedListNode<Integer> middle(LinkedListNode<Integer> start, LinkedListNode<Integer> end) {
		if(start == null || start.next == null|| start == end) return start;
		LinkedListNode<Integer> slow = start, fast = start.next;
		while(fast != end && fast.next != end) {
			slow = slow.next;
			fast = fast.next.next;
		} 
		return null;
    }

    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        LinkedListNode<Integer> head, tail;
        if(head1.data < head2.data) {
            head = head1;
            head1 = head1.next;
        }else{
            head = head2;
            head2 = head2.next;
        }
        tail = head;

        while(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                LinkedListNode<Integer> temp = new LinkedListNode<>(head1.data);
                tail.next = temp;
                tail = tail.next;
            }else{
                LinkedListNode<Integer> temp = new LinkedListNode<>(head2.data);
                tail.next = temp;
                tail = tail.next;
            }
        }
        if(head1 != null) tail.next = head1;
        if(head2 != null) tail.next = head2;
        return head;
    }

	public static LinkedListNode<Integer> sortList(LinkedListNode<Integer> start, LinkedListNode<Integer> end) {
		if(start == end) return null;
		LinkedListNode<Integer> mid = middle(start, end);
		LinkedListNode<Integer> left = sortList(start, mid);
		LinkedListNode<Integer> right = sortList(mid.next, end);
		return merge(left, right);

	}
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
		return null;
	}
	


}