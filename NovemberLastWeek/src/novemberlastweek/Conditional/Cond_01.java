/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novemberlastweek.Conditional;

import java.util.ArrayList;
import novemberlastweek.Employee;

/**
 *
 * @author B-5
 */
public class Cond_01 {
     public static void main(String[] args) {

        //  ArrayList
//        List<Employee> li = new ArrayList<Employee>();    //we can do it by "import"

        ArrayList<Employee> li = new ArrayList<Employee>();

        Employee emp1 = new Employee("Salman", 25);
        Employee emp2 = new Employee("Ahamed", 30);
        Employee emp3 = new Employee("Zaman", 35);
        Employee emp4 = new Employee("Klam", 32);
        Employee emp5 = new Employee("Nazmul", 27);
        Employee emp6 = new Employee("Rafayet", 30);
        Employee emp7 = new Employee("Babu", 10);
        Employee emp9 = new Employee("Seikh", 55);
        Employee emp10 = new Employee("Laile", 60);
        Employee emp11 = new Employee("Mojnu", 74);
        Employee emp12 = new Employee("Chengish Khan", 30);

        li.add(emp1);
        li.add(emp2);
        li.add(emp3);
        li.add(emp4);
        li.add(emp5);
        li.add(emp6);
        li.add(emp7);
        li.add(emp9);
        li.add(emp10);
        li.add(emp11);
        li.add(emp12);
        
         //another way to add in OBJECT  
         
         
//    li.add(new Employee("Babu", 47));    
//    li.add(new Employee("Seikh", 11));
//    li.add(new Employee("Laile", 8));
//    li.add(new Employee("Mojnu", 36));
//    li.add(new Employee("Chengish Khan", 18));
//        System.out.println("result----" + li.get(0).toString());
//        System.out.println("another---" + li.get(4));
//        System.out.println("another---" + li.get(4).getName());
//        System.out.println("another---" + li.get(4).getAge());




//        conditional of Object oriented Array List
        /* 10-25 or 30 = name  A
        31-40 or 27 or 43-55 = name b
        other c */
        
        
        
        for (Employee employee : li) {

            if ((employee.getAge() >= 10 && employee.getAge() <= 25) || employee.getAge() == 30) {
                employee.setName("A");
            } else if ((employee.getAge() >= 31 && employee.getAge() <= 40) || employee.getAge() == 30 || (employee.getAge() >= 43 && employee.getAge() <= 55)) {
                employee.setName("B");
            } else {
                employee.setName("C");
            };
            System.out.println(employee.toString());
            System.out.println(" ");
        }




     }
}
