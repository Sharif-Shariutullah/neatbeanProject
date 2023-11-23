package novemberlastweek.Nov23;

public class Employee {

    private String name;
    private int age;
    private String Sub;

    //Constructor

    public Employee(String name, int age, String Sub) {
        this.name = name;
        this.age = age;
        this.Sub = Sub;
    }
    
    
    
 

    public void displayInfromation() {

        System.out.println("Hello -----  1st line----- Method of displayInfromation");

        System.out.println("Name--" + name);
        System.out.println("Age---" + age);        
        System.out.println("Subject---" + Sub);

    }

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSub() {
        return Sub;
    }

    public void setSub(String Sub) {
        this.Sub = Sub;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", Sub=" + Sub + '}';
    }
    
    
    

    
    
    

}
