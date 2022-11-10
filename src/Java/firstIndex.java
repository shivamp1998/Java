package Java;

public class firstIndex {
    public static int findIndex(int []arr, int x)  {
        if(arr.length == 0) {
            return -1;
        }
        if(arr[0] == x) return 0;
        int smArray[] = new int [arr.length-1];
        for(int i=1; i<smArray.length; i++) {
            smArray[i-1] = arr[i];
     
        }
        int fn = findIndex(smArray,x);
        if(fn == -1) return -1;
        else return fn+1;
    }
    public static void main(String ...args) {
        int arr[] = {1,2,4,3,5};
        System.out.println(findIndex(arr,4));
    }
}
