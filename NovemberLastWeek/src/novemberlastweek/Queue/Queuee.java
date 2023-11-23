
package novemberlastweek.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Queuee {
    
    public static void main(String[] args) {
        
    /*    
        //        3 types of   Queue in JAVA

        Queue<String> QU = new LinkedList<>();
        Queue<String> QU1 = new ArrayDeque<>();
        Queue<String> QU2 = new PriorityQueue<>();
    */
    
    Queue<trainee> QUU = new LinkedList<>();
    
    trainee Q1 = new trainee("A", "DU", 10);
    trainee Q2 = new trainee("B", "DU", 20);
    trainee Q3 = new trainee("C", "DU", 30);
    trainee Q4 = new trainee("D", "DU", 40);
    trainee Q5 = new trainee("F", "DU", 50);
    
    
    QUU.offer(Q1);
    QUU.offer(Q2);
    QUU.offer(Q3);
    QUU.offer(Q4);
    QUU.offer(Q5);
  
    
//    Print
    
//        System.out.println("");
//        System.out.println("Final result  " + QUU);
//        System.out.println("Final result  " + QUU.toString());
//            System.out.println("");

            
            for (trainee object : QUU) {
             System.out.println("Final result  " + QUU);

        }
    }
    
}
