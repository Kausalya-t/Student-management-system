import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Search Student");
            System.out.println("4 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    service.addStudent(new student(id, name, marks));
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();

                    service.searchStudent(searchId);
                    break;

                case 4:
                    return;
            }
        }
    }
}