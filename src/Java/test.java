package Java;

public class test {
  public static void main (String[] args) {
    int arr[][]=new int[4][5];
    for(int i=0;i<5;i++)
    {
        arr[i][0]=2;
    }
    System.out.println(arr[0][0]);
    System.out.print(arr[3][0]);
}
}
