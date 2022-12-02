package Java;

public class duplicatesLL {
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        while(curr != null) {
            LinkedListNode<Integer> temp = curr;
            while(temp != null && temp.data ==  curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
        }
        return head;
    }
}
