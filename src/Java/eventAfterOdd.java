package Java;

public class eventAfterOdd {
    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        if (head == null || head.next == null)
            return head;
        LinkedListNode<Integer> eHead = null, eTail = null;
        LinkedListNode<Integer> oHead = null, oTail = null;
        if (head.data % 2 == 0) {
            eHead = head;
            eTail = head;
        } else {
            oHead = head;
            oTail = head;
        }
        head = head.next;
        while (head != null) {
            LinkedListNode<Integer> temp = new LinkedListNode<>(head.data);
            System.out.println(head.data);
            if (head.data % 2 == 0) {
                if (eTail != null)
                    eTail.next = temp;
                else {
                    eHead = temp;
                    eTail = temp;
                }
                eTail = eTail.next;
            } else {
                if (oTail != null)
                    oTail.next = temp;
                else {
                    eHead = temp;
                    oTail = temp;
                }
                oTail = oTail.next;
            }
            head = head.next;
        }
        if (oTail == null)
            return eHead;
        else
            oTail.next = eHead;
        return oHead;
    }
}
