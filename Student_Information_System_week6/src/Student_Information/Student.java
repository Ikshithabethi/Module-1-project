package Student_Information;
import java.util.ArrayList;
import java.util.List;
public class Student {
	private String studentId;
    private String name;
    private List<Course> coursesEnrolled;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
}
