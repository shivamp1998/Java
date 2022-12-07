package Java;

public class reverseRecursively {
    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if(head == null || head.next == null) return head;
        LinkedListNode<Integer> tail = reverseLinkedListRec(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }
}
