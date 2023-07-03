package Java;
import java.util.LinkedList;
import java.util.Queue;
public class Stack2Queue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size;

    public Stack2Queue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        size = 0;
    }





    public int getSize() { 
        return size;
    }

    public boolean isEmpty() { 
        return size == 0;
    }

    public void push(int element) {
        q1.add(element);
        size++;
    }

    public int pop() {
        if(size == 0) return -1;
        int temp = size;
        while(temp > 1) {
            q2.add(q1.remove());
            temp--;
        }
        int data = q1.remove();
        while(!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        size--;
        return data;
    }

    public int top() {
        if(size == 0) return -1;
        int temp = size;
        while( temp > 1) {
            q2.add(q1.remove());
            temp--;
        }
        int data = q1.remove();
        while(!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        q1.add(data);
        return data;
    }
}
