
package crudapplication;

import crudapplication.Model.Student;
import crudapplication.Model.subEnum;
import crudapplication.Service.StudentService;
import crudapplication.Service.StudentServiceIMPL;
import java.time.LocalDateTime;


public class Main {

  
    public static void main(String[] args) {
       
        StudentService studentService = new StudentServiceIMPL();
     
        
        Student student = new Student(9l, "Ahmed", "Khulna", LocalDateTime.now(), subEnum.C);
        
        
        Student student2 = new Student();
        student.setId(10l);
        student.setName("Sharif");
        student.setAddress("Dhaka");
        student.setDoB(LocalDateTime.now());
        student.setSubject(subEnum.DOTNET);
        
        studentService.addStudent(student);
    }
    
}
