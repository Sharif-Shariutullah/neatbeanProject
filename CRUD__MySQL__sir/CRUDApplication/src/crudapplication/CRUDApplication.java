package crudapplication;

import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;
import crudapplication.service.StudentService;
import crudapplication.service.StudentServiceImpl;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;


public class CRUDApplication {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter numbers to calculate the conditional sum: ");
        while (true) {
            System.out.println("Please insert the operation type: ADD/EDIT/DELETE/GET ");
            String val = scanner.next();
            if (val.toUpperCase().equals("ADD")) {

                System.out.println("Please insert Student ID NAME ADDRESS SUBJECT: ");
                Long id = scanner.nextLong();
                String name = scanner.next();
                String address = scanner.next();
                String enumValue = scanner.next();
                SubjectEnum stuEnum = SubjectEnum.JAVA;

                switch (enumValue.toUpperCase()) {
                    case "JAVA":
                        stuEnum = SubjectEnum.JAVA;
                        break;
                    case "C":
                        stuEnum = SubjectEnum.C;
                        break;
                    case "DOTNET":
                        stuEnum = SubjectEnum.DOTNET;
                        break;
                    case "PHP":
                        stuEnum = SubjectEnum.PHP;
                        break;
                    default:
                        break;
                }
                Student student = new Student(id, name, address, LocalDateTime.now(), stuEnum);
                studentService.addStudent(student);
                
            } else if (val.toUpperCase().equals("EDIT")) {
                System.out.println("EDIT Call");
            } else if (val.toUpperCase().equals("DELETE")) {
                System.out.println("DELETE Call");
            } else if (val.toUpperCase().equals("GET")) {
                List<Student> stu = studentService.getAll();
                for (Student student : stu) {
                    System.out.println(student.toString());
                }
            }
        }

    }

}
