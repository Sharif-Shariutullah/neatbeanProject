package novemberlastweek.Nov23;

import java.util.ArrayList;
import java.util.List;

public class CoditionalARRAYlist {

    public static void main(String[] args) {

        //  ArrayList
//        List<Employee> li = new ArrayList<Employee>();    //we can do it by "import"
        
ArrayList<Employee> li = new ArrayList<>();


        Employee emp1 = new Employee("Salman", 25, "A");
        Employee emp2 = new Employee("Ahamed", 30 , "A");
        Employee emp3 = new Employee("Zaman", 35, "A");
        Employee emp4 = new Employee("Klam", 32, "A");
        Employee emp5 = new Employee("Nazmul", 27, "A");
        Employee emp6 = new Employee("Rafayet", 30, "A");
        Employee emp7 = new Employee("Babu", 10, "A");
        Employee emp9 = new Employee("Seikh", 55, "A");
        Employee emp10 = new Employee("Laile", 60, "A");
        Employee emp11 = new Employee("Mojnu", 74, "A");
        Employee emp12 = new Employee("Chengish Khan", 30, "A");
//
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

//        conditional of Object oriented Array List
        /* 10-25 or 30 = name  A
        31-40 or 27 or 43-55 = name b
        other c */
        for (Employee employee : li) {

            if ((employee.getAge() >= 10 && employee.getAge() <= 25) || employee.getAge() == 30) {

                employee.setSub("JAVA");
            } else if ((employee.getAge() >= 31 && employee.getAge() <= 40) || employee.getAge() == 30 || (employee.getAge() >= 43 && employee.getAge() <= 55)) {
                employee.setSub("PHP");
            } else {
                employee.setSub("C#");
            };
//            System.out.println(employee.toString());
            System.out.println(employee.toString());

            System.out.println(" ");
        }

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
        /*
//for each


for (Employee employee : li) {

//          System.out.println("only name---" + li.get(5));   //full list
            System.out.println("only name---" + employee.getName());
            System.out.println("\n");
            System.out.println("only Age---" + employee.getAge());

        }
         */
//for loop
//
//        for (int i = 0; i <li.size(); i++) {
//
//            System.out.println("name   " + li.get(i).getName() );
//        }
//  for loop   of  condional print  
//        age = 30 ... name
//        age = 30+ ... age
        /*
        for (int i = 0; i <li.size(); i++) {

            if (li.get(i).getAge() >= 30) {
                System.out.println(li.get(i).getName());
            }else
                        System.out.println(li.get(i).getAge() );
                 }
         */
//        for loop of highest and lowest
//        Employee h = li.get(0);
//        Employee l = li.get(0);
//
//        for (int i = 0; i < li.size(); i++) {
//
//            if (h.getAge() < li.get(i).getAge()) {
//                h = li.get(i);
//            }
//            if (h.getAge() > li.get(i).getAge()) {
//                l = li.get(i);
//            }
//        }
//
//        System.out.println("Highest " + h.getAge());
//        System.out.println("Lowest " + l.getAge());
        //for each highest and lowest
//        for (Employee vvv : li) {
//
//            if (h.getAge() < vvv.getAge()) {
//                h = vvv;
//            }
//            if (h.getAge() > vvv.getAge()) {
//                l = vvv;
//            }
//        }
//
//        System.out.println("Highest " + h.getAge());
//        System.out.println("Lowest " + l.getAge());
    }

    //method calling
}
