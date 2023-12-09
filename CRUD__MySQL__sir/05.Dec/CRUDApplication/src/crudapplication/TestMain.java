/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication;

import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;
import crudapplication.service.TestService;
import java.time.LocalDateTime;

/**
 *
 * @author B-4
 */
public class TestMain {
    
    
    public static void main(String[] args) {
        TestService2 testService = new TestService2();
        
        Student stu1 = new Student(1l, "Ahmad", "Dhaka", LocalDateTime.now(), SubjectEnum.JAVA);
        testService.addStudent2(stu1);
        Student stu2 = new Student(2l, "AAAA", "Noakhali", LocalDateTime.now(), SubjectEnum.DOTNET);
        testService.addStudent2(stu2);
        Student stu3 = new Student(3l, "BBBB", "Khulna", LocalDateTime.now(), SubjectEnum.PHP);
        testService.addStudent2(stu3);
        Student stu4 = new Student(4l, "CCCC", "Rajshahi", LocalDateTime.now(), SubjectEnum.JAVA);
        testService.addStudent2(stu4);

//        TestService.getAllStudend();
//        TestService.deleteStudend(2l);
        testService.getAllStudend2();
        System.out.println("--------------");
        Student stu5 = new Student(2l, "HHHH", "Rajshahi", LocalDateTime.now(), SubjectEnum.C);
        testService.updateStudend2(stu5, 2l);
        testService.getAllStudend2();

    }
    
}
