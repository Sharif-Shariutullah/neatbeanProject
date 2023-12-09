/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication;

import crudapplication.model.Student;
import crudapplication.service.TestService;

/**
 *
 * @author B-4
 */
public class TestService2 {
    
    TestService testService = new TestService();

    public void addStudent2(Student stu) {
        testService.addStudent(stu);
    }

    public  void getAllStudend2() {
        testService.getAllStudend();
    }

    public  void getStudend2(Long id) {
        testService.getStudend(id);
    }

    public  void updateStudend2(Student stu, Long id) {
        testService.updateStudend(stu, id);
    }

    public  void deleteStudend2(Long id) {
        testService.deleteStudend(id);
    }
    
    
}
