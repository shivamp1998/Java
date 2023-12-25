package Java;

public class HeapSort {
    public static int[] heapify(int arr[], int index) {
        for (int i = 0; i <= index; i++) {
            int childIndex = i;
            while (childIndex > 0) {
                int parentIndex = (childIndex - 1) / 2;
                if (arr[parentIndex] > arr[childIndex]) {
                    int temp = arr[parentIndex];
                    arr[parentIndex] = arr[childIndex];
                    arr[childIndex] = temp;
                    childIndex = parentIndex;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void inplaceHeapSort(int arr[]) {
        int index = arr.length - 1;
        while (index > 0) {
            arr = heapify(arr, index);
            int temp = arr[0];
            arr[0] = arr[index];
            arr[index] = temp;
            index--;
        }
    }
}
