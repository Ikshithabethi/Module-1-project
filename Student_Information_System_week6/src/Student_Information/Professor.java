package Student_Information;
import java.util.List;
public class Professor extends Person {
	    private List<Course> coursesTeaching;

	    public Professor(String professorId, String name) {
	        super(professorId, name);
	    }

	    @Override
	    public void displayDetails() {
	        System.out.println("Professor ID: " + id + ", Name: " + name);
	    }

	    public void assignCourse(Course course) {
	        coursesTeaching.add(course);
	    }
	}
