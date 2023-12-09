
package createreadupdatedelete.Emp;

import java.time.LocalTime;


public class Employee {
    
    
    private Long id;
    private String name;
    private String address;
    private double salary;
    private LocalTime dob;
    private String gender;
    private DepEnum dept;
    private String email;

    
    //constructor default
    public Employee() {
    }
    
    //constructor with value

    public Employee(Long id, String name, String address, double salary, LocalTime dob, String gender, DepEnum dept, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.dob = dob;
        this.gender = gender;
        this.dept = dept;
        this.email = email;
    }

   

//    Setter

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDob(LocalTime dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(DepEnum dept) {
        this.dept = dept;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public LocalTime getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public DepEnum getDept() {
        return dept;
    }

//    getter
    public String getEmail() {
        return email;
    }

//    print

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", dob=" + dob + ", gender=" + gender + ", dept=" + dept + ", email=" + email + '}';
    }

    
    
    
    
    
    
}
