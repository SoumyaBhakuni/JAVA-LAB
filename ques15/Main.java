import student.Student;
import course.Course;
import enrollment.Enrollment;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("S101", "Alice", 20);
        Course course = new Course("C202", "Data Structures", 4);
        Enrollment enrollment = new Enrollment(student, course);

        System.out.println("Enrollment Details:\n" + enrollment.getEnrollmentInfo());
    }
}

