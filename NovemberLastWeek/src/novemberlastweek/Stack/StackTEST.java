
package novemberlastweek.Stack;

import java.util.Stack;


public class StackTEST {
    
    public static void main(String[] args) {
        
        Stack<Student> st = new Stack<>();
        
//                Employee emp1 = new Employee("Salman", 25);

        Student stock1 = new Student("A", "DU", 10);
        Student stock2 = new Student("B", "DU", 11);
        Student stock3 = new Student("C", "DU", 12);
        Student stock4 = new Student("D", "DU", 13);
        Student stock5 = new Student("E", "DU", 14);

        st.push(stock1);
        st.push(stock2);
        st.push(stock3);
        st.push(stock4);
        st.push(stock5);

        
        
//        System.out.println("result  " + stock1);
        
        System.out.println("result  " + st.peek() + "\n");
        System.out.println("result  " + st.peek() + "\n");
        System.out.println("----" + st.empty());
        
        System.out.println("////" + st.pop());
        
                System.out.println("result  " + st.peek() + "\n");

        
//        st.push("Sharif", "DU", 10);
        
        
        
    }
    
    
}
