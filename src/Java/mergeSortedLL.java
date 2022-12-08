package Java;

public class mergeSortedLL {
    public static LinkedListNode<Integer> mergeSorted(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1 == null) {
            return head2;
        }
        if(head2 == null) {
            return head1;
        }
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        if(head1.data > head2.data) {
            head = head1;
            tail = head1;
            head1 = head1.next;
        }else{
            head = head2;
            tail = head2;
            head2 = head2.next;
        }

        while(head1!=null && head2!=null) {
            if(head1.data <= head2.data) {
                tail.next = head1;
                tail = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                tail = head2;
                head2 = head2.next;
            }
        }
        if(head1 != null) {
            tail.next = head1;
        }
        if(head2 != null) {
            tail.next = head2;
        }
        return head;
    }
}
