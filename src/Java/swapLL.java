package Java;

public class swapLL {
    public static LinkedListNode<Integer>  swap(LinkedListNode<Integer> head,LinkedListNode<Integer> x, LinkedListNode<Integer> y) {
        LinkedListNode<Integer> currX = head, prevX = null;
        while(currX != x) {
            prevX = currX;
            currX = currX.next;
        }
        LinkedListNode<Integer> currY = head, prevY = null;
        while(currY != y) {
            prevY = currY;
            currY = currY.next;
        }
        if(prevX != null) {
            prevX.next = currY;
        }else{
            head = currY;
        }

        if(prevY != null) {
            prevY.next = currX;
        }else{
            head = currX;
        }
        LinkedListNode<Integer> temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;

    }    
}
