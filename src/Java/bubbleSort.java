package Java;

public class bubbleSort {
    public static int length(LinkedListNode<Integer> head) {
        int count = 0;
        while(head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    public static LinkedListNode<Integer> bubbleSortMethod(LinkedListNode<Integer> head) {
        for(int i = 0 ; i < length(head) - 1 ; i++) {
            LinkedListNode<Integer> prev = null, curr = head, next = head.next;
            while(curr.next != null) {
                if(curr.data > curr.next.data) {
                    if(prev == null) {
                        curr.next = next.next;
                        next.next = curr;
                        prev = head;
                        head = prev;
                    }else{
                        next = curr.next;
                        curr.next = next.next;
                        prev.next = next;
                        next.next = curr;
                        prev = next;
                    }
                }else{
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }
    public static void main(String...args) {

    }    
}
