import java.util.*;

public class StudentService {

    ArrayList<student> students = new ArrayList<>();

    public void addStudent(student s) {
        students.add(s);
        System.out.println("Student added.");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (student s : students) {
            s.display();
        }
    }

    public void searchStudent(int id) {

        for (student s : students) {
            if (s.id == id) {
                s.display();
                return;
            }
        }

        System.out.println("Student not found.");
    }
}