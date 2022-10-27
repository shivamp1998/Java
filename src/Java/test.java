package Java;
public class test {
    public static boolean isPrime(int x)
    {
        for(int i=2;i<x/2;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    
    }
    public static void main (String[] args) {
        System.out.print(isPrime(47));
    }
}
