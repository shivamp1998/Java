package Java;

public class test {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("");
        for (int i = 0; i < 5; i++) {
            str1.append((char) ('a' + i));
        }
        System.out.println(str1);
    }
}
