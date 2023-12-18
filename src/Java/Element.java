package Java;

public class Element<T> {
    T value;
    int priority;
    
    Element(T value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}
