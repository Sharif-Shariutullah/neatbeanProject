package crudapplication.Model;

import java.time.LocalDateTime;

public class Student {

    private Long id;
    private String name;
    private String Address;
    private LocalDateTime DoB;
    private subEnum subject;

    
    
    
    //Constructor
    public Student() {
    }

    ;

 
    
    public Student(Long id, String name, String Address, LocalDateTime DoB, subEnum subject) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.DoB = DoB;
        this.subject = subject;
    }

    
    
//    Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public LocalDateTime getDoB() {
        return DoB;
    }

    public void setDoB(LocalDateTime DoB) {
        this.DoB = DoB;
    }

    public subEnum getSubject() {
        return subject;
    }

    public void setSubject(subEnum subject) {
        this.subject = subject;
    }

    
    
    
    //Display Information
    
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", Address=" + Address + ", DoB=" + DoB + ", subject=" + subject + '}';
    }

    
    
    
    
    
}
