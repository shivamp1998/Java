package Java;


public class mergeSort {
    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;

        if (head1.data < head2.data) {
            head = head1;
            tail = head1;
            head1 = head1.next;
        } else {
            head = head2;
            tail = head2;
            head2 = head2.next;
        }

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tail.next = head1;
                tail = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                tail = head2;
                head2 = head2.next;
            }
        }

        if (head1 != null) {
            tail.next = head1;
        }

        if (head2 != null) {
            tail.next = head2;
        }

        return head;
    }

    public static LinkedListNode<Integer> midEle(LinkedListNode<Integer> head) {
        if(head == null) return head;
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while(fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static LinkedListNode<Integer> mergeSorted(LinkedListNode<Integer> head) {
        if( head == null || head.next == null) return head;
        LinkedListNode<Integer> mid = midEle(head);
        LinkedListNode<Integer> midNext = mid.next;
        mid.next = null;
        LinkedListNode<Integer> t1 = mergeSorted(head);
        LinkedListNode<Integer> t2 = mergeSorted(midNext);
        LinkedListNode<Integer> ans =  merge(t1, t2);
        return ans;
    }

    public static void main(String...args) {

    }
}
