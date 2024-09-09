package Student_Information;

public class Client {

	public static void main(String[] args) {
        Student student1 = new Student("S001", "John Doe");
        Student student2 = new Student("S002", "Jane Doe");

        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");

        EnrollmentManager enrollmentManager = new EnrollmentManager();
        enrollmentManager.enrollStudentInCourse(student1, course1);
        enrollmentManager.enrollStudentInCourse(student1, course2);
        enrollmentManager.enrollStudentInCourse(student2, course2);

        student1.displayDetails();
        student2.displayDetails();
        System.out.println("Courses enrolled by " + student1.getName() + ": " + student1.getCoursesEnrolled().size());
        System.out.println("Courses enrolled by " + student2.getName() + ": " + student2.getCoursesEnrolled().size());

        System.out.println("Students enrolled in " + course1.getCourseName() + ": " + course1.getEnrolledStudents().size());
        System.out.println("Students enrolled in " + course2.getCourseName() + ": " + course2.getEnrolledStudents().size());
    }
}