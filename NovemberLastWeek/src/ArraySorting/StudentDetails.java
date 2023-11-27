import java.util.Scanner;

public class StudentDetails {
    private int id;
    private String name;
    private String sub;

   
    public StudentDetails(int id, String name, String sub) {
        this.id = id;
        this.name = name;
        this.sub = sub;
    }


    public void validateDetails() {
        if (id > 4000) {
            System.out.println("Error: ID cannot be more than 4000.");
        }

        if (!name.toLowerCase().contains("md")) {
            System.out.println("Error: Name must contain 'md'.");
        }

        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + sub);
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Name: ");
        String name = scanner.next();

        System.out.print("Enter Subject: ");
        String sub = scanner.next();

        StudentDetails student = new StudentDetails(id, name, sub);
        student.validateDetails();
    }
}
