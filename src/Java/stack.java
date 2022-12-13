package Java;

public class stack {
    private int data[];
    private int topIndex;

    stack() {
        this.data = new int [10];
        topIndex = -1;
    }

    public void push(int data) {
        if(topIndex < this.data.length) {
            topIndex++;
            this.data[topIndex] = data;
        }else{
            System.out.println(" stack overflow ");
        }
    }

    public int size() {
        return topIndex + 1;
    }

    public int top() {
        if(topIndex == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return this.data[topIndex];
    }

    public int pop() {
        if(topIndex < 0) {
            System.out.println("Stack empty");
            return -1;
        }else{
            topIndex--;
        }
        return this.data[topIndex+1];
    }
    
    public boolean isEmpty() {
        if(topIndex == -1) return true;
        return false;
    }
}
