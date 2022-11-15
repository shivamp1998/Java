package Java;
public class javaMergeSort {
    public static void merge(int s1[], int s2[], int d[]) {
        int i = 0 , j = 0 , k = 0;
        while(i < s1.length && j < s2.length) {
            if(s1[i] <= s2[j]) {
                d[k] = s1[i];
                k++;
                i++;
            }else{
                d[k] = s2[j];
                k++;
                j++;
            }
        }
        while(i < s1.length) {
            d[k] = s1[i];
            k++;
            i++;
        }
        while(j < s2.length) {
            d[k] = s2[j];
            k++;
            j++;
        }
    }
    public static void mergeSort(int arr[]) {
        if(arr.length <= 1) return;
        
        int a1[] = new int [arr.length/2];
        int a2[] = new int [arr.length - a1.length];
        for(int i=0; i<arr.length/2; i++) {
            a1[i] = arr[i];
        }
        for(int i=arr.length/2; i<arr.length; i++) {
            a2[i - arr.length/2] = arr[i];

        }
        mergeSort(a1);
        mergeSort(a2);
        merge(a1,a2,arr);
    }
    public static void main(String...args) {
        int arr[] = new int[] {1,3,2,4,5};
        mergeSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }   
}
