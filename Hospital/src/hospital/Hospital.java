package hospital;

import Model.depEnum;
import Model.patient;
import Service.Service;
import static Service.Service.showPatient;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
 
public static void main(String[] args) {
        
Service list = new Service();
    
patient pat1 = new patient(1l, "Salman", "Rongpur", LocalDateTime.now(), depEnum.Head);
list.addPatient(pat1);
 
patient pat2 = new patient(2l, "Mehdi", "Noakhali", LocalDateTime.now(), depEnum.Eye);
list.addPatient(pat2);

patient pat3 = new patient(3l, "Sharif", "Gazipur", LocalDateTime.now(), depEnum.Hair);
list.addPatient(pat3);

patient pat4 = new patient(4l, "Uncle", "Dhaka", LocalDateTime.now(), depEnum.Hand);
list.addPatient(pat4);

patient pat5 = new patient(5l, "aunty", "Barishal", LocalDateTime.now(), depEnum.Leg);
list.addPatient(pat5);
     



//showPatient(pat1);
 list.showPatientALL();

System.out.println("\n");
//list.UpdatePatient(pat5, 2l);  //update

//    try {
//        list.DeletPatient(4l);  //delete
//    } catch (Exception e) {
//        System.out.println(e);
//    }

System.out.println("\n");

// list.showPatientALL();


    }

    
    
}
