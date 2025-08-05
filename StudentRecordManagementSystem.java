import java.util.*;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { 
        return id;
    }

    public void show() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentRecordManagementSystem{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n 1.Add  2.View  3.Delete  4.Exit");
            System.out.print("Enter your choice:");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks: ");
                double marks = sc.nextDouble();
                list.add(new Student(id, name, marks));
            } else if (ch == 2) {
                for (Student s : list) s.show();
            } else if (ch == 3) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                list.removeIf(s -> s.getId() == id);
            } else if (ch == 4) {
                break;
            } else {
                System.out.println("Invalid choice..Please Choose the Correct Choice");
            }
        }

        System.out.println("Operation sucessfull");
        sc.close();
    }

}
