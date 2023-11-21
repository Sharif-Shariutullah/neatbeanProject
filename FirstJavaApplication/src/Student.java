
public class Student {
    
   public int ID = 5;
   public String name = "Sharif";
   public String address = "Dhaka";
    
    
//    method 01
    
     public  void studentInfo() {

          System.out.println(ID);
    } ; 
    
     
//     method 02
     
      public void studentname() {

          System.out.println(ID + ' ' + name + ' ' + address);
    } ; 

 
      
      
//      ----------------------------       main method 
      
public static void main(String[] args) {

    Student info = new Student();
    info.studentname();
    
    
    
};

public Long id;
public String name1;
public String address2;


public void setVal (Long id, String name1, String address2){
this.id = id;
this.name1 = name1;
this.address2 = address2;

};


public void getVal(){
    System.out.println( "ID:" + id + "NAME:" + name1 + "ADDRESS" + address2);

};


};