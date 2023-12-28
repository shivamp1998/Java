package Java;

public class CheckMaxHeap {
    public static boolean checkMaxHeap(int arr[]) {
		int n = arr.length;
		for(int i=n-1; i>=0; i--) {
			int childIndex = i;
			while(childIndex > 0) {
				int parentIndex = (childIndex - 1) / 2;
				if(arr[parentIndex] < arr[childIndex]) return false;
				childIndex = parentIndex;
			}
		}
		return true;
	}
}
