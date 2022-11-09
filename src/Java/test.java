package Java;

public class test {
    public static void print(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(n);
            return;
        }
        print(n--);
        System.out.print(n+" ");
    }
    
    public static void main(String[] args) {
        int num = 3;
        print(num);
    }
    
}
