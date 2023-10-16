package Java;
import java.util.*;

public class GenericTreeTest {

    public static int noOfNode(GenericTree<Integer> root) {
        
        int count = 1;
        for(int i=0; i<root.children.size(); i++) {
            int childCount = noOfNode(root.children.get(i));
            count += childCount;
        }
        return count;
    }

    public static int sumOfAllNode(GenericTree<Integer> root) {
        int sum = root.data;
        for(int i=0; i<root.children.size(); i++) {
            int childrenSum = sumOfAllNode(root.children.get(i));
            sum+=childrenSum;
        }
        return sum;
    }
    public static void print(GenericTree<Integer> root) {
        if(root == null) return;
        System.out.print(root.data);
        for(int i=0; i<root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static GenericTree<Integer>  takeInputLevelwise() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Queue<GenericTree<Integer>> q = new LinkedList<>();
        GenericTree<Integer> root = new GenericTree<Integer>(data);
        q.add(root);
        while(!q.isEmpty()) {
            GenericTree<Integer> front = q.poll();
            int levels = sc.nextInt();
            for(int i=0; i<levels; i++) {
                GenericTree<Integer> node = new GenericTree<Integer>(sc.nextInt());
                front.children.add(node);
                q.add(node);
            }
        }
        sc.close();
        return root;
    }


    public static void printTreeLevelwise(GenericTree<Integer> root) {
        Queue<GenericTree<Integer>> q = new LinkedList<>();
        if(root.data == -1) return;
        q.add(root);
        q.add(null);
        System.out.println(root.data);
        while(!q.isEmpty()) {
            GenericTree<Integer> front = q.poll();
            if(front != null) {
                for(int i=0; i<front.children.size(); i++) {
                    System.out.print(front.children.get(i).data + " ");
                    q.add(front.children.get(i));
                }
            }else if(q.isEmpty()){
                return;
            }else{
                System.out.println();
                q.add(null);
            }
        }

    } 


    public static void main(String...args) {
        GenericTree<Integer> root = takeInputLevelwise();
        printTreeLevelwise(root);
    }
}
