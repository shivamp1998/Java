package Java;
public class minArrayRecur {
    public static int minimum(int [] arr, int min, int index) {
        if(index >= arr.length) {
            return min;
        }
        if(arr[index] < min) {
            return minimum(arr,arr[index],index+1);
        }else return minimum(arr, min, index+1);
    }
    public static void main(String...args) {
        int arr[] = new int []{5,1,2,3,4};
        System.out.println(minimum(arr,Integer.MAX_VALUE, 0));
        
    }
}
