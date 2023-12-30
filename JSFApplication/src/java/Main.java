
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author B-5
 */
@ManagedBean
@RequestScoped
public class Main {

  //object
   student stu = new student();
    
   
   //list
   
    List<student> stuList = new ArrayList<student>() ;

// Map for calling request and response    
    private Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
    
    
    
    //list getter setter
    
    public List<student> getStuList() {
        return stuList;
    }

    
    public void setStuList(List<student> stuList) {
        this.stuList = stuList;
    }
   
    
    
   
   //getter Setter

    public student getStu() {
        return stu;
    }

    public void setStu(student stu) {
        this.stu = stu;
    }
   
   
    
    
//    method 01
    
    public String addData(){
        
        System.out.println(stu.getFirstName());
        System.out.println(stu.getLastName());
        System.out.println(stu.getEmail());
        System.out.println(stu.getPhoneNumber());
        
    return "/edit.xhtml";    // call edit page
    };
    
    //    method 02

    
    
     public String getData(){
//         sessionMap.put( , stu);
         
    return "";
    };
       
       //    method 03

       
     public String editData(){
    return " ";
    };
          
     //    method 04

          
     public String UpdateData(){
    return " ";
    };
    
             //    method 05

             
     public String DeleteData(){
    return " ";
    };
     
     
     
    public Main() {
    }
    
    
}
