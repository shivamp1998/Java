package Java;

public class deleteNodeLL {
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        if (head == null)
            return head;
        LinkedListNode<Integer> prev = head;
        LinkedListNode<Integer> curr = head.next;
        if (pos == 0) {
            return head.next;
        }

        while (--pos > 0 && curr != null) {
            prev = curr;
            curr = curr.next;
        }

        if (pos >= 0 && curr == null) {
            return head;
        } else {
            prev.next = curr.next;
        }

        return head;
    }
}
