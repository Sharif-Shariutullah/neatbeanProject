/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication.service;

import crudapplication.model.Student;
import java.util.List;

public interface StudentService {
    
    void addStudent(Student student);
    
    Student getStudentByID(Long id);
    
    Integer updateStudent(Student stu, Long id);
    
    List<Student> getAll();
    
    Integer deleteStudent(Long id);
    
}
