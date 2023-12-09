/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication.model;

import java.time.LocalDateTime;

/**
 *
 * @author B-4
 */
public class Student {

    public Student() {
    }

    public Student(Long id, String name, String address, LocalDateTime dob, SubjectEnum subject) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.subject = subject;
    }

    private Long id;
    private String name;
    private String address;
    private LocalDateTime dob;
    private SubjectEnum subject;

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SubjectEnum getSubject() {
        return subject;
    }

    public void setSubject(SubjectEnum subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + ", subject=" + subject + '}';
    }
    
    
    
}
