package Java;
import java.util.*;

public class DownHeapify {
    ArrayList<Integer> heap = new ArrayList<>();
    
    void downheapify() {
        int minIndex = 0;
        int parentIndex = 0;
        int leftChild = 2 * parentIndex + 1;
        int rightChild = 2 * parentIndex + 2;

        while(leftChild < heap.size() && rightChild < heap.size()) {
            if(heap.get(leftChild) < heap.get(minIndex)) {
                minIndex = leftChild;
            }
            if(heap.get(rightChild) < heap.get(minIndex)) {
                minIndex = rightChild;
            }
            if(minIndex != parentIndex) {
                int temp = heap.get(minIndex);
                heap.set(minIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                parentIndex = minIndex;
                rightChild = 2 * parentIndex + 1;
                leftChild = 2 * parentIndex + 2;
            }else{
                break;
            }
        }
    }
}
