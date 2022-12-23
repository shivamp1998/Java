package Java;

public class evenOddll {
    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> evenEnd = null;
        LinkedListNode<Integer> oddStart = null, oddEnd = null;
        while(head!=null) {
            if(head.data % 2 == 0 ) {
                if(evenEnd == null) {
                    evenEnd = head;
                }else{
                    LinkedListNode<Integer> temp = new LinkedListNode<>(head.data);
                    evenEnd.next = temp;
                    evenEnd = temp;
                }
            }else{
                if(oddEnd == null) {
                    oddStart = head;
                    oddEnd = head;
                }else{
                    LinkedListNode<Integer> temp = new LinkedListNode<Integer>(head.data);
                    oddEnd.next = temp;
                    oddEnd = temp;
                }
            }
            head = head.next;
            
        }
        oddEnd.next = evenEnd;
        return oddStart;

	}
}
