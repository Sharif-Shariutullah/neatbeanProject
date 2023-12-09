package crudapplication;

import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class testService {

    //-----------------Adding Student by method 
    public static void main(String[] args) {

        TS2 testService = new TS2();

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

//        toGETID(1l);  //calling by ID
        testService.toSHOWAll();  // To Show all

        System.out.println("\n");

//      delete
//        try {
//               toDElte(1l); // to delete
//        } catch (Exception e) {
//            System.out.println("--------------");
//        }
        Student s44 = new Student(11l, "Sharif", "Dhaka", LocalDateTime.now(), SubjectEnum.DOTNET);

        testService.toUpdate(s44, 2l);

        System.out.println("\n");

        testService.toSHOWAll();  // To Show all

    }

    //             -----ID------
;

}
