package Java;

public class ReverseKList {

    
    public static Node kReverse(Node head, int k) {
        if(k == 0 || k == 1) return head;
        Node curr = head;
        Node next = null;
        Node prev = null;
        int count = k;
        while(curr != null && count-- > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(next != null) {
            head.next = kReverse(next, k);
        }
        return prev;
        
    }  
}
