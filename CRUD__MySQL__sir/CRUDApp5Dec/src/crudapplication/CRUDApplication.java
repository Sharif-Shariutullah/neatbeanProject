/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication;

import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;
import crudapplication.service.StudentService;
import crudapplication.service.StudentServiceImpl;
import java.time.LocalDateTime;
import java.util.Scanner;


public class CRUDApplication {

    public static void main(String[] args) {
        StudentServiceImpl testService = new StudentServiceImpl();
        
 Student s1 = new Student(11l, "Sharif", "Dhaka", LocalDateTime.now(), SubjectEnum.DOTNET);
        testService.addStudent(s1);

        Student s2 = new Student(1l, "Arif", "Cumilla", LocalDateTime.now(), SubjectEnum.DDD);
        testService.addStudent(s2);

        Student s3 = new Student(2l, "Tusher", "Chottogram", LocalDateTime.now(), SubjectEnum.JAVA);
        testService.addStudent(s3);

        Student s4 = new Student(41l, "Shaon", "Rajshahi", LocalDateTime.now(), SubjectEnum.JAVA);
        testService.addStudent(s4);

        Student s6 = new Student(31l, "Jamal", "Rongpur", LocalDateTime.now(), SubjectEnum.DOTNET);
        testService.addStudent(s6);

        Student s5 = new Student(91l, "Kamal", "Sylet", LocalDateTime.now(), SubjectEnum.NT);
        testService.addStudent(s5);

        Student s7 = new Student(71l, "Hero", "Dhaka", LocalDateTime.now(), SubjectEnum.PHP);
        testService.addStudent(s7);
        
        
        
        testService.toString();
//        Scanner scanner = new Scanner(System.in);
//
////        System.out.println("Enter numbers to calculate the conditional sum: ");
//        
//
//while (true) {
//            System.out.println("Please insert the operation type: ADD/EDIT/DELETE/GET ");
//
//            String val = scanner.next();
//            if (val.toUpperCase().equals("ADD")) {
//
//                System.out.println("Please insert Student ID NAME ADDRESS SUBJECT: ");
//                Long id = scanner.nextLong();
//                String name = scanner.next();
//                String address = scanner.next();
//                String enumValue = scanner.next();
//                SubjectEnum stuEnum = SubjectEnum.JAVA;
//
//                if (enumValue.toUpperCase().equals("JAVA")) {
//                    stuEnum = SubjectEnum.JAVA;
//                } else if (enumValue.toUpperCase().equals("C")) {
//                    stuEnum = SubjectEnum.C;
//                } else if (enumValue.toUpperCase().equals("DOTNET")) {
//                    stuEnum = SubjectEnum.DOTNET;
//                } else if (enumValue.toUpperCase().equals("PHP")) {
//                    stuEnum = SubjectEnum.PHP;
//                }
//                Student student = new Student(id, name, address, LocalDateTime.now(), stuEnum);
//                studentService.addStudent(student);
//
//            } else if (val.toUpperCase().equals("EDIT")) {
//                System.out.println("EDIT Call");
//            } else if (val.toUpperCase().equals("DELETE")) {
//                System.out.println("DELETE Call");
//            } else if (val.toUpperCase().equals("GET")) {
//                System.out.println("GET Call");
//            }
//        }

    }

}
