package Java;
public class factorial {
    public static int fact(int n) {
        if(n == 1 || n == 0 ) return 1;
        return n*fact(n-1);
    }
}
