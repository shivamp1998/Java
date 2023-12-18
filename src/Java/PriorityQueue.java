package Java;
import java.util.*;
public class PriorityQueue<T> {
    ArrayList<Element<T>> element;
    public PriorityQueue() {
        element = new ArrayList<>();
    }
    public  void insertIntoHeap(Element<T> e) {
        int size = element.size();
        if(size == 0) {
            element.set(0, e);
            size++;
            return;
        }
        int currPriority = e.priority;
        int sIndex = size-1;
        while(sIndex >= 0) {
            int parent = (sIndex - 1) / 2;
            if(element.get(parent).priority > currPriority) {
                element.set(parent, e);
            }
            sIndex = parent;
        }
    }
}
