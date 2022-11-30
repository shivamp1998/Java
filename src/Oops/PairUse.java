package Oops;

public class PairUse {
    public static void main(String ...args) {
        Pair<Integer> p = new Pair<Integer>(10,20);
        System.out.println(p.getFirst() + " " + p.getSecond());
        Pair<String> p1 = new Pair<String>("a","b");
        System.out.println(p1.getFirst() + " " + p1.getSecond());

    }
    
}
