package Java;
public class minCount {
    public static int minimumCount(int n) {
        if(n <= 3) return n;
        int res = n;
        for(int i=1; i<=n; i++) {
            if(i*i > n) break;
            res = Math.min(res, 1 + minimumCount(n-i*i));
        }
        return res;
    }
    public static void main(String...args) {

    }
}
