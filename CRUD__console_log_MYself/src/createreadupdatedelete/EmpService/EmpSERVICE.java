/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createreadupdatedelete.EmpService;

import static createreadupdatedelete.Emp.DepEnum.Employee;
import createreadupdatedelete.Emp.Employee;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author B-5
 */
public class EmpSERVICE {
    
    public List<Employee> empLIST = new ArrayList<>();
    
   
    //Add
      public void addEMP(Employee emp) {
      empLIST.add(emp);
    }
    
      // print
       public  void showEMP() {
           for (Employee employee : empLIST) {
               System.out.println(employee.toString());
           }
    }
       
    
          public  void toGETID(Long id) {
        //For each

        for (Employee stu : empLIST) {
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
       
       
       
       
       
       //delete
        public  void toDelete(Long id) {

        for (Employee del : empLIST) {
            
            if (del.getId().equals(id)) {
                empLIST.remove(del);
                System.out.println("done");
            }
//            if (del.getId().equals(id)) {
//                empLIST.remove(del);
//                System.out.println("delete successful");
//            }

//        for (int i = 0; i < liststudent.size(); i++) {
//            if (liststudent.get(i).getId().equals(id)) {
//                liststudent.remove(i);
//                System.out.println("remove done");
//            }
//            
//        }
        }
    }
        
        
        
        //Update
        
          public  void toUpdate(Employee stu, Long id) {
        stu.setId(id);
        boolean status = false;
        for (int i = 0; i < empLIST.size(); i++) {
            if (empLIST.get(i).getId().equals(id)) {
                empLIST.remove(i);
                empLIST.add(i, stu);
                status = true;
                break;

            }
        }
        if (!status) {
            empLIST.add(stu);
        }
    }
          
          
          
       
}
