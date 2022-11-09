package Java;

public class checkSortedArray {
    public static boolean isSorted(int[] arr, int n) {
        if(n == arr.length -1 ) return true;
        if(arr[n] > arr[n+1]) return false;
        return isSorted(arr, n+1);
    }
    public static void main(String ...args) {
        int arr[] = new int[]{1,3,2,4,5};
        System.out.print(isSorted(arr,0));
    }
}
