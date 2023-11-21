package midexam;

import java.util.ArrayList;

public class practice {

    public static void main(String[] args) {
//textarrlist();
//randARRlist();



        ArrayList<Integer> li = new ArrayList<Integer>();

        li.add(12);
        li.add(18);
        li.add(17);
        li.add(16);
        li.add(21);
        li.add(57);
        li.add(143);
        li.add(100);

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
