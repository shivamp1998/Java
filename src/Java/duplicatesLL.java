package Java;

public class duplicatesLL {
    public static LinkedListNode<Integer> alterNateApproach(LinkedListNode<Integer> head) {
        if(head == null) return null;
        head.next = alterNateApproach(head.next);
        if(head.next != null && head.data.equals(head.next.data)) return head.next;
        return head;
    }
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        while(curr != null && curr.next != null) {
            if(curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
