package Java;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class test {
    public static void main (String[] args) {
        Queue<Integer> q=new LinkedList<Integer>();
        Stack<Integer> s=new Stack<Integer>();
        q.add(5);
        q.add(10);
        s.push(10);
        s.push(20);
        System.out.print(q.peek()+s.pop());
    }
}