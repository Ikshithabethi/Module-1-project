package Student_Information;

public class EnrollmentService {
	private CourseEnrollable enrollable;

    public EnrollmentService(Student student) {
        this.enrollable = (CourseEnrollable) student;
    }

    public void enroll(Course course) {
        enrollable.enrollInCourse(course);
    }
}