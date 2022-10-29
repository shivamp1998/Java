package Java;
public class mergeTwoArrays {
    public static void main(String ...args) {
        int arr1[] = new int []{1,2,3,5};
        int arr2[] = new int []{4,6};
        int i1 = 0 , j = 0;
        int n = arr1.length;
        int m = arr2.length;
        int k = 0;
        int newArray[] = new int [m+n];
        while(i1<n && j<m) {
            if(arr1[i1] < arr2[j]) {
                newArray[k++] = arr1[i1++];
            }else{
                newArray[k++] = arr2[j++];
            }
        }
        
        while(i1 < n) {
            newArray[k++] = arr1[i1++];
        }
        while(j < m) {
            newArray[k++] = arr2[j++];
        }
        int[] finalArray = newArray; 
        
        for(int i=0; i<finalArray.length; i++) {
            System.out.print(finalArray[i]);
        }

    }
}
