package Java;

public class countminSteps {
    public static int minSteps(int n) {
        if(n == 1) return 0;
        int a1 = Integer.MAX_VALUE, a2 = Integer.MAX_VALUE, a3 = Integer.MAX_VALUE;
        if(n%3 == 0) a1 = 1 + minSteps(n/3);
        if(n%2 == 0) a2 = 1 + minSteps(n/2);
        a3 = 1 + minSteps(n-1); 
        return Math.min(a1, Math.min(a2, a3));
    }

    public static void main(String...args) {
        
    }

}
