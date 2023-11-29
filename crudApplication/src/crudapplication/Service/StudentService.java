package crudapplication.Service;

import crudapplication.Model.Student;
import java.util.List;

public interface StudentService {

//    Student addStudent(Student student);
    
    
    void addStudent(Student student);

    Student getStudentByID(Long id);

    void updateStudent();

    List<Student> getll();

    long deleteStudent(Long id);

}
