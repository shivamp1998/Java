package Oops;
// no need of import statements if class file and use file are in the same package; 
public class StudentUse {
    public static void main(String...args) {
        Student s = new Student();
        s.roll_no = 12;
        s.name = "jack";
        // s.cannot_be_accessed_outside_class = "new name"; will give error due to access modifier being restricted to private
        System.out.println(s.name + " " + s.roll_no);
    }
}
