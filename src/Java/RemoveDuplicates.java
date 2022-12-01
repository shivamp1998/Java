package Java;
import java.util.ArrayList;
public class RemoveDuplicates {
    public static void main(String ...args) {
        ArrayList<Integer> a = new ArrayList<Integer>(10);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(3);

        for(int i=1; i<a.size(); i++) {
            if(a.get(i-1) == a.get(i)) {
                a.remove(i-1);
            }
        }

        for(int i=0; i<a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        
    }
}
