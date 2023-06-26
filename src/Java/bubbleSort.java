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
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
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

                    }
                }else{

                }
            }
        }
        return head;
    }
    public static void main(String...args) {

    }    
}
