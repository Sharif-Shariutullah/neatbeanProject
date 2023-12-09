package createreadupdatedelete;

import static createreadupdatedelete.Emp.DepEnum.Employee;
import createreadupdatedelete.Emp.Employee;
import createreadupdatedelete.EmpService.EmpSERVICE;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CreateReadUpdateDelete {

    public static void main(String[] args) {

        EmpSERVICE listzz = new EmpSERVICE();
      

 Employee e1 = new Employee(1l, "Saiful Sir", "IsDB", 99000.00, LocalTime.now(), "Male", Employee.MD, "abc@gmail.com");
listzz.addEMP(e1);

 Employee e2 = new Employee(2l, "Hanee Madam", "IsDB", 9000.00, LocalTime.now(), "Female", Employee.HR, "abc@gmail.com");
listzz.addEMP(e2);

 Employee e3 = new Employee(3l, "Mehdi Sir", "IsDB", 11000.00, LocalTime.now(), "Male", Employee.Manger, "abc@gmail.com");
listzz.addEMP(e3);

 Employee e4 = new Employee(4l, "Abeer Sir", "IsDB", 19000.00, LocalTime.now(), "Male", Employee.PrManager, "abc@gmail.com");
listzz.addEMP(e4);

 Employee e5 = new Employee(5l, "Abul Hasanat Sir", "IsDB", 89000.00, LocalTime.now(), "Male", Employee.Security, "abc@gmail.com");
listzz.addEMP(e5);

 Employee e6 = new Employee(6l, "Salman Sir", "IsDB", 39000.00, LocalTime.now(), "Male", Employee.Supplier, "abc@gmail.com");
listzz.addEMP(e6);

 Employee e7 = new Employee(7l, "Imara Sir", "IsDB", 49000.00, LocalTime.now(), "Male", Employee.Employee, "abc@gmail.com");
  listzz.addEMP(e7);


 
  
//  list.addEMP(e7);

        //to show all
         listzz.showEMP();
                                            System.out.println("\n");
                
//        delete
//        listzz.toDelete(6l);

//         Update
//listzz.toUpdate(e7, 4l);




        
                                             System.out.println("\n");
        
        //to show all
        listzz.showEMP();

    }

}
