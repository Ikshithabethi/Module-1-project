package Student_Information;

public class LSPTest {
    public static void main(String[] args) {
        Object student = new Student("S123", "Alice");
        Person professor = new Professor("P456", "Dr. Bob");

        displayPersonDetails(student);
        displayPersonDetails(professor);
    }

    public static void displayPersonDetails(Object student) {
        ((Student) student).displayDetails();
    }
}
