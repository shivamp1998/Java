package Java;
import java.util.HashMap;
public class hashMap {
    public static void main(String...args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("abc",1);
        if(m.containsKey("abc")) {
            System.out.println("abc present");
        }
        //null pointer exception
        int v1 = m.get("abc3");
        System.out.println(m.size());
    }
}
