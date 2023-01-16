package Java;
public class multiply {
    public int multiple(int n, int start) {
        if(n == 1) return 1;
        int temp = n;
        int res = 1;
        while ( temp > 0) {
            res *= ++start;
            temp--;
        }
        return res;
    }
    public static void main(String...args) {

    }
}
