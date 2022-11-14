package Java;

public class recursiveBinarySearch {
    public static int b_search(int []arr, int start, int end, int x) {
        int mid = end + (start - end )/2;
        if(start > end) return -1;
        if(arr[mid] == x) return mid;
        else if(arr[mid] < x) return b_search(arr, start, mid-1, x);
        else return b_search(arr, mid+1, end, x);
    }  
    public static void main(String ...args) {
        int arr[] = new int[]{1,2,34,4,5};
        System.out.print(b_search(arr,0,4,7));
    }    
}
