package Student_Information;

public class DIPTest {

	public static void main(String[] args) {
        Course course = new Course("C101", "Introduction to SOLID");
        Student student = new Student("S123", "Alice");

        EnrollmentService enrollmentService = new EnrollmentService(student);
        enrollmentService.enroll(course);
    }
}
