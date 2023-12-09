
package crudapplication.service;

import crudapplication.model.Student;
import java.util.List;


public interface StudentService {
    
    void addStudent(Student student);
    
    Student getStudentByID(Long id);
    
    void updateStudent();
    
    List<Student> getAll();
    
    Long deleteStudent(Long id);
    
}
