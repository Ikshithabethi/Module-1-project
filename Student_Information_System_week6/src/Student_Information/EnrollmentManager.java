package Student_Information;

public class EnrollmentManager {
	public void enrollStudentInCourse(Student student, Course course) {
        student.enrollCourse(course);
        course.enrollStudent(student);
    }
}
