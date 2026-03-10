public class student {

    int id;
    String name;
    int marks;

    public student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + marks);
    }
}
