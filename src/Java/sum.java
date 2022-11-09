package Java;

public class sum {
    public static int sum (int n) {
        if(n==0 || n==1) return n;
        return n+sum(n-1);
    }
    public static void main(String...args) {
        System.out.print(sum(10));
    }
}
