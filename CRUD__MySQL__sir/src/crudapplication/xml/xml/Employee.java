/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication.xml.xml;

/**
 *
 * @author User
 */

public class Employee {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String role;
    private Address address;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    @Override
//    public String toString() {
//        return "Employee{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", role=" + role + ", address={" + address.getName()+" " +address.getLoc()+ "}}";
//    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", role=" + role + ", address=" + address + '}';
    }
    
   
}
