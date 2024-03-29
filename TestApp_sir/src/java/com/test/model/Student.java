/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author B-4
 */
public class Student {

    public Student() {
    }

    public Student(Long id, String name, String address, LocalDate dob, SubjectEnum subject) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.subject = subject;
    }

    public Student(String name, String address, LocalDate dob, SubjectEnum subject) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.subject = subject;
    }

    
    
    private Long id;
    private String name;
    private String address;
    private LocalDate dob;
    private SubjectEnum subject;

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
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
        return "id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + ", subject=" + subject + "\n";
    }
}
