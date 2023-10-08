package Java;

public class sum {
    public static int sumOfNumber (int n) {
        if(n==0 || n==1) return n;
        return n+sumOfNumber(n-1);
    }
    public static void main(String...args) {
        System.out.print(sumOfNumber(10));
    }
}
