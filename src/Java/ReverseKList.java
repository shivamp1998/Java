package Java;

public class ReverseKList {
    public static Node reverse(Node head, int k) {
        Node curr = head;
        Node prev = null;
        while(curr!=null) {
            curr.next = prev;
            prev = curr;
            curr = curr.next;
        }
        return head;   
    }  
}
