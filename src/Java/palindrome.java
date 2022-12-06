package Java;
import java.util.*;

public class palindrome {
   
    public static boolean palindromeLL(LinkedListNode<Integer> head) {
       Stack<Integer> s = new Stack<>();
       LinkedListNode<Integer> curr = head;

       while(curr != null) {
        s.push(curr.data);
        curr = curr.next;
       }

       while(head != null) {
        if(s.empty()) return true;
        if(head.data != s.pop()) return false;
        head = head.next;
       } 
       return true;
    }
}
