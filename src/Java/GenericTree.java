package Java;
import java.util.*;

public class GenericTree<T> {
    T data;
    ArrayList<GenericTree<T>> children;
    public GenericTree(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}
