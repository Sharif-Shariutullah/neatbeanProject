package practice;

import java.util.ArrayList;

public class practice {

    public static void main(String[] args) {
//textarrlist();
//randARRlist();

        conditionalArrayList();
    }

    public static void conditionalArrayList() {

        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(12);
        li.add(18);
        li.add(17);
        li.add(16);
        li.add(21);
        li.add(57);
        li.add(43);
        li.add(100);

//        10 - 15 or 17  = A
//        20-25 or 16 = B
//        40-45 or 18 or 57  = C 
//        others = D
//        input - 12, 18, 17, 21, 16, 57, 43, 100
//        ans = A C A B B C C D
        for (Integer integer : li) {

            System.out.print(integer + "    ");

            if ((integer >= 10 && integer <= 15) || integer == 17) {
                System.out.println("A");
            } else if ((integer >= 20 && integer <= 25) || integer == 16) {
                System.out.println("B");
            } else if (integer == 18 || (integer >= 40 && integer <= 45) || integer == 57) {
                System.out.println("C");
            } else {
                System.out.println("D");
            };

        }
    }

    ;
    
    
    
    
    
    
    public static void textarrlist() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println(list);
    }

    ;
    
    
    public static void randARRlist() {
        ArrayList<Integer> li = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {

            Integer abc = (int) (Math.random() * 10);
            li.add(abc);
            System.out.print(abc + " ");
        }

        for (Integer integer : li) {

            System.out.print(integer + "    ");
            if (integer >= 1 && integer <= 3) {
                System.out.print("A");
            } else if (integer >= 4 && integer <= 6) {
                System.out.print("B");
            } else {
                System.out.print("c");
            };
        }
    }

}


