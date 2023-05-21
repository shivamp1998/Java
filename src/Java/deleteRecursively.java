package Java;

public class deleteRecursively {
    public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head, int pos) {
        if(head == null) return null;
        if(pos == 0) return head.next;
        head.next = delete(head.next, --pos);
        return head;
    }
    public static void main(String...args) {

    }
}
