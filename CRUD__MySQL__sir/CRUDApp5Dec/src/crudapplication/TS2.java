/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication;

import static crudapplication.TS1.liststudent;
import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;

/**
 *
 * @author B-5
 */
public class TS2 {

    TS1 ts1 = new TS1();

    public void addStudent(Student stu) {
        ts1.addStudent(stu);
    }

    public void toGETID(Long id) {
        ts1.toGETID(id);
    }

    public void toGetSUBJECT(String subject) {

    }

    ;
         
    public void toGetAddress(String address) {

        ts1.toGetAddress(address);
    }

    ;

    public void toDElte(long id) {

        ts1.toDElte(id);
    }

    public void toSHOWAll() {
        ts1.toSHOWAll();
    }

    public void toUpdate(Student stu, Long id) {
        ts1.toUpdate(stu, id);
    }
;

}
