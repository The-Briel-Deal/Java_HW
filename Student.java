import java.util.jar.Attributes.Name;

public class Student {
    // TODO: Build Student class with private fields and methods listed above

    // TODO: Define two private member fields
    private String name = "Louie";
    private double gpa = 1.0;;

    public Student() {
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setGPA(Double d) {
        gpa = d;
    }

    public Double getGPA() {
        return gpa;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + "/" + student.getGPA());
        student.setName("Felix");
        student.setGPA(3.7);
        System.out.println(student.getName() + "/" + student.getGPA());
    }
}