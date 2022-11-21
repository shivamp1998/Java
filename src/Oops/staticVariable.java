package Oops;
public class staticVariable {
    public static void main(String...args) {
        Student s1 = new Student("shivam",1);
        Student s2 = new Student("priyam",2);
        System.out.println(Student.StudentNums); //static variable accessing
        
    }
}
