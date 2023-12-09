
package Service;

import Model.patient;
import java.util.ArrayList;
import java.util.List;


public class Service {
    
    
    public static List<patient> pat = new ArrayList<>();

// create
    public static void addPatient(patient p) {
        pat.add(p);
    }

    
    //Read
    public static void showPatient(patient s) {
       
        for (patient object : pat) {
            System.out.println(pat.toString());
        }
        
    }
    
    
      public static void showPatientALL() {
       
        for (patient object : pat) {
            System.out.println(object.toString());
        }
        
    }
    
    
    
    //Update
    public static void UpdatePatient(patient u, long id) {

     u.setId(id);
        boolean status = false;
        for (int i = 0; i < pat.size(); i++) {
            if (pat.get(i).getId().equals(id)) {
                pat.remove(i);
                pat.add(i, u);
                status = true;
                break;

            }
        }
        if (!status) {
            pat.add(u);
    }
    
    }
    
//      if (del.getId().equals(id)) {
//                empLIST.remove(del);
//                System.out.println("done");
//            }
    
    
     //Delete
    public static void DeletPatient(Long id) {
        for (patient object : pat) {
            
            if (object.getId().equals(id)) {
                pat.remove(object);
                System.out.println("done");
            }
        }
    }
}
