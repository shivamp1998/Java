package Java;

public class ReverseKList {
    public static Node kReverse(Node head, int k) {
        if(k == 0 || k == 1 ) return head;
        if(head == null || head.next == null) return head;
        Node prev = null, curr = head, next = head.next;
        while(--k > 0 && next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        Node temp  = next;
        kReverse(next, k);
        temp.next = curr;
        return curr;
    }  
}
