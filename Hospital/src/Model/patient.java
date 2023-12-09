
package Model;

import java.time.LocalDateTime;

public class patient {
    
    private Long id;
    private String name;
    private String address;
    private LocalDateTime dob;
    private depEnum subject;

    
    
    
    
    //Constructor 
    
    public patient() {
    }
    
    
    
    //Constructor    02
    public patient(Long id, String name, String address, LocalDateTime dob, depEnum subject) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.subject = subject;
    }

    
    //setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public void setSubject(depEnum subject) {
        this.subject = subject;
    }

    
    
    //Getter

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public depEnum getSubject() {
        return subject;
    }
    



//  Print
    @Override
    public String toString() {
        return "patient{" + "id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + ", subject=" + subject + '}';
    }










}
