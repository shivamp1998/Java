package Java;

public class midLinkedList {
    public static LinkedListNode<Integer> mid(LinkedListNode<Integer> head) {
        if(head == null || head.next == null) return head;
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head.next.next;

        while(fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}
