/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication;

import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author B-5
 */
public class TS1 {

    public static List<Student> liststudent = new ArrayList<>();

    public  void addStudent(Student stu) {
        liststudent.add(stu);
    }

    public  void toGETID(Long id) {
        //For each

        for (Student stu : liststudent) {
            if (stu.getId().equals(1l)) {
                System.out.println(stu.toString());
            }
        }

//for loop        
//        for (int i = 0; i < liststudent.size(); i++) {
//            
//            if (liststudent.get(i).getId().equals(41)) {
//                System.out.println(liststudent.get(i).toString());
//            }
//        }
    }

    public  void toGetSUBJECT(String subject) {

        //             -----Subject------
        for (Student sub : liststudent) {
            if (sub.getSubject().equals(SubjectEnum.JAVA)) {
                System.out.println(sub.toString());
            }
        }

    }

    ;
         
    public  void toGetAddress(String address) {

//             -----Address------
//-----------for each
        for (Student add : liststudent) {
            if (add.getAddress().equals("Dhaka")) {
                System.out.println(add.toString());
            }
        }

//-------------for loop
//                for (int i = 0; i < liststudent.size(); i++) {
//                    if (liststudent.get(i).getAddress().equals("Rongpur")) {
//                         System.out.println(liststudent.get(i).toString());
//                    }
//        }
    }

    ;

    public  void toDElte(long id) {

        for (Student del : liststudent) {
            if (del.getId().equals(id)) {
                liststudent.remove(del);
                System.out.println("delete successful");
            }

//        for (int i = 0; i < liststudent.size(); i++) {
//            if (liststudent.get(i).getId().equals(id)) {
//                liststudent.remove(i);
//                System.out.println("remove done");
//            }
//            
//        }
        }
    }

    public  void toSHOWAll() {
        for (Student student : liststudent) {
            System.out.println(student.toString());
        }
    }

    public  void toUpdate(Student stu, Long id) {
        stu.setId(id);
        boolean status = false;
        for (int i = 0; i < liststudent.size(); i++) {
            if (liststudent.get(i).getId().equals(id)) {
                liststudent.remove(i);
                liststudent.add(i, stu);
                status = true;
                break;

            }
        }
        if (!status) {
            liststudent.add(stu);
        }
    }
;
;
    
}
