package Java;
public class SwapTwoNode {
    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        int m = Math.min(i, j);
        int n = Math.max(i, j);
        LinkedListNode<Integer> prev1 = null, prev2 = null, curr1 = head, curr2 = head;

        while (m-- > 0 && curr1 != null) {
            prev1 = curr1;
            curr1 = curr1.next;
        }
        while (n-- > 0 && curr2 != null) {
            prev2 = curr2;
            curr2 = curr2.next;
        }

        // System.out.println(curr1.data + " " + curr2.data);

        if (prev1 == null) {
            head = curr2;
        } else {
            prev1.next = curr2;
        }
        if (prev2 == null) {
            head = curr1;
        } else {
            prev2.next = curr1;
        }

        LinkedListNode<Integer> temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;

        return head;

    }
}
