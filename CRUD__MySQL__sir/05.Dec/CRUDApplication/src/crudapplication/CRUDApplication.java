package crudapplication;

import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;
import crudapplication.service.StudentService;
import crudapplication.service.StudentServiceImpl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class CRUDApplication {

    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();

//        Student stu1 = new Student(1l, "Ahmad", "Dhaka", LocalDateTime.now(), SubjectEnum.JAVA);
//        studentService.addStudent(stu1);
//        Student stu2 = new Student(2l, "AAAA", "Noakhali", LocalDateTime.now(), SubjectEnum.DOTNET);
//        studentService.addStudent(stu2);
//        Student stu3 = new Student(3l, "BBBB", "Khulna", LocalDateTime.now(), SubjectEnum.PHP);
//        studentService.addStudent(stu3);
//        Student stu4 = new Student(4l, "CCCC", "Rajshahi", LocalDateTime.now(), SubjectEnum.JAVA);
//        studentService.addStudent(stu4);
//
//        List<Student> stu = studentService.getAll();
//        for (Student student : stu) {
//            System.out.println(student.toString());
//        }
        studentService.getStudentByID(2l).toString();
        System.out.println(studentService.getStudentByID(2l).toString());
//        
//        Long id = studentService.deleteStudent(2l);
//        System.out.println("Delete OK!");
//        
        
        
        
        
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter numbers to calculate the conditional sum: ");
//        while (true) {
//            System.out.println("Please insert the operation type: ADD/EDIT/DELETE/GET ");
//            String val = scanner.next();
//            if (val.toUpperCase().equals("ADD")) {
//                System.out.println("Please insert Student ID NAME ADDRESS SUBJECT: ");
//                Long id = scanner.nextLong();
//                String name = scanner.next();
//                String address = scanner.next();
//                String userInputEnum = scanner.next();
//                SubjectEnum stuEnum = SubjectEnum.JAVA;
//                switch (userInputEnum.toUpperCase()) {
//                    case "JAVA":
//                        stuEnum = SubjectEnum.JAVA;
//                        break;
//                    case "C":
//                        stuEnum = SubjectEnum.C;
//                        break;
//                    case "DOTNET":
//                        stuEnum = SubjectEnum.DOTNET;
//                        break;
//                    case "PHP":
//                        stuEnum = SubjectEnum.PHP;
//                        break;
//                    default:
//                        break;
//                }
//                Student student = new Student(id, name, address, LocalDateTime.now(), stuEnum);
//                studentService.addStudent(student);
//            } else if (val.toUpperCase().equals("GET")) {
//                List<Student> stu = studentService.getAll();
//                for (Student student : stu) {
//                    System.out.println(student.toString());
//                }
//            }else if (val.toUpperCase().equals("DELETE")) {
//              Long id = studentService.deleteStudent(scanner.nextLong());
//                System.out.println("Delete OK!");
//            }
//        }
    }

}
