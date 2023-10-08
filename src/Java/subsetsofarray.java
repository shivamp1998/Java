package Java;
import java.util.*;
public abstract class subsetsofarray {
    public static void subsets(int arr[], int startIndex, String ans) {
        if(startIndex == arr.length) {
            System.out.println(ans);
            return;
        }
        subsets(arr, startIndex+1, ans);
        subsets(arr, startIndex+1, ans + arr[startIndex]);
    }   
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        subsets(arr, 0, "");
        sc.close();
    }
}
