package Java;
import java.util.*;
public class PQ {
	ArrayList<Integer> heap = new ArrayList<>();
	boolean isEmpty() {
		return heap.size() == 0;
	}

	int getSize() {
		return heap.size();
	}

	int getMax() {
		if(isEmpty()) return Integer.MIN_VALUE;
		return heap.get(0);
	}

	void insert(int element) {
		if(heap.size() == 0) {
			heap.add(element);
			return;
		}
		int childIndex = getSize();
		int parentIndex = (childIndex - 1) / 2;
		heap.add(element);
		while(parentIndex >= 0) {
			if(heap.get(parentIndex) < heap.get(childIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}else{
				break;
			}
		} 
		
	}
	void downheapify() {
		int parentIndex = 0;
		int maxIndex = 0;
		int leftChild = 2 * parentIndex + 1;
		int rightChild = 2 * parentIndex + 2;
		while(leftChild < heap.size()) {
			if(heap.get(leftChild) > heap.get(maxIndex)) {
				maxIndex = leftChild;
			}
			if(heap.size() > rightChild && heap.get(rightChild) > heap.get(maxIndex)) {
				maxIndex = rightChild;
			}
			if(maxIndex != parentIndex) {
				int temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(maxIndex));
				heap.set(maxIndex, temp);
				parentIndex = maxIndex;
				leftChild = 2 * parentIndex + 1;
				rightChild = 2 * parentIndex + 2;
			}else{
				break;
			}
		}
	}
	int removeMax() {
		if(isEmpty()) return Integer.MAX_VALUE;
		int max = heap.get(0);
		// System.out.print(heap.get(getSize() - 1) + "value" + max);
		heap.set(0, heap.get(getSize()-1));
		heap.remove(getSize()-1);
		downheapify();
		return max;	
		// for(int x: heap) {
		// 	System.out.println("heap" + x);
		// }
		// return 0;
	}
}