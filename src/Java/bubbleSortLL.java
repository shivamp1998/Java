package Java;

public class bubbleSortLL {
    /**
     * @param head
     * @param t1
     * @param t2
     */
    public static void swap(Node head, Node t1, Node t2) {
        
    }
    public static Node sort(Node head) {
        int len = length(head);
        if(head == null || head.next == null) return head;
        Node curr = head, next = null;
        for(int i=0; i<len; i++) {
            while(curr!=null) {
                next = curr.next;
                if(curr.data > next.data) {
                }
            }
        }
        return head;
    }
    public static int length(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

}
