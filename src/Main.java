import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Dave", 21, "Male", 10234);
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Gender: " + student1.getGender());
        System.out.println("ID NO: " + student1.getIdNo());
    }
}
