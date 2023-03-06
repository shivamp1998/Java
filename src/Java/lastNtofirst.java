package Java;

public class lastNtofirst {
    public static LinkedListNode<Integer> lasttofirst(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> tmp1 = head,tmp2=head;
        while(--n > 1 && tmp1!=null) {
            tmp1 = tmp1.next;
        }
        while(tmp2.next!=null) {
            tmp2 = tmp2.next;
        }
        tmp2.next = head;
        head = tmp1.next;
        tmp1.next = null;
        return head;
    }
    public static void main(String...args) {

    }
}
