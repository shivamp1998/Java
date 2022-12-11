package Java;

public class reverseK {

    public static LinkedListNode<Integer>  reverseLL(LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {
        if(head == null || head == tail) return head;

        LinkedListNode<Integer> newH = reverseLL(head.next, tail);
        head.next.next = head;
        head.next = null;
        return newH; 
    }
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		LinkedListNode<Integer> nHead = null;
        LinkedListNode<Integer> mHead = null;
        int skip = k;
        while(head!=null) {
            LinkedListNode<Integer> rHead = head;
            while(skip-- > 0) {
                head = head.next;
            }
            if(nHead == null) {
                nHead = reverseLL(rHead, head);
                mHead = nHead;
            }else{
                nHead.next = reverseLL(rHead, head);
            }
        }
        return mHead;
	}   
}
