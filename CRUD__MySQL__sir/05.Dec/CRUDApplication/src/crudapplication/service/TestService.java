/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication.service;

import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author B-4
 */
public class TestService {

    public  List<Student> listStudent = new ArrayList<>();


    public void addStudent(Student stu) {
        listStudent.add(stu);
    }

    public  void getAllStudend() {
        for (Student student : listStudent) {
            System.out.println(student.toString());
        }
    }

    public  void getStudend(Long id) {
        for (Student student : listStudent) {
            if (student.getId().equals(id)) {//1
                System.out.println(student.toString());
            }
        }
    }

    public  void updateStudend(Student stu, Long id) {
        stu.setId(id);
        boolean status = false;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId().equals(id)) {//1
                listStudent.remove(i);
                listStudent.add(i,stu);
                status = true;
                break;
            }
        }
        if (status==false) {
            listStudent.add(stu);
        }
    }

    public  void deleteStudend(Long id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId().equals(id)) {//1
                listStudent.remove(i);
                System.out.println("Delete Successful!!");
            }
        }
    }
}

//    listEmployee.stream().filter((student) -> (student.getId().equals(1l))).forEachOrdered((student) -> {
//            System.out.println(student.toString());
//        });
