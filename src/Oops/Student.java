package Oops;

public class Student {
    String name;
    int roll_no;
    private int cannot_be_accessed_outside_class = 0;

    public int getPrivateVar() {
        return cannot_be_accessed_outside_class;
    }
    
    public void setPrivateVar(int val) {
        cannot_be_accessed_outside_class = val;
    }
}
