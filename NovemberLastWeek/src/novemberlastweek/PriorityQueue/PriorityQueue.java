package novemberlastweek.PriorityQueue;

import java.util.*;

public class PriorityQueue {

    public static void main(String[] args) {

        Queue<traineee> PQ = new java.util.PriorityQueue<>();

        PQ.add(new traineee("A", "DU", 101));
        PQ.add(new traineee("B", "DU", 102));
        PQ.add(new traineee("C", "DU", 103));
        PQ.add(new traineee("D", "DU", 104));
        PQ.add(new traineee("E", "DU", 104));
        PQ.add(new traineee("F", "DU", 105));
        PQ.add(new traineee("E", "DU", 106));
        PQ.add(new traineee("G", "DU", 107));

 //for loop
        for (traineee object : PQ) {
            System.out.println("result--" + object.toString());
        }
    
     // while
        while (!PQ.isEmpty()) {            
        System.out.println("result--" + PQ.poll().toString());
        }
        
        
     // for loop one more
        
        for (; !PQ.isEmpty();) {
            
        }
        
    }
}
