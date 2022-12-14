
package Java;

public class stackLL {
    int size;
    Node head;
    
    public stackLL() {
        size = 0;
        head = null;    
    }





    public int getSize() { 
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(size == 0) return -1;
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int top() {
        if(size == 0) return -1;
        return head.data;
    }
}