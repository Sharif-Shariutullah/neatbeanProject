package midexamnov;

import java.util.HashMap;
import java.util.Map;

public class MAP {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();
        m.put(25, "Shaon");
        m.put(30, "IsDB");
        m.put(40, "saiful sir");
        m.put(50, "Akhas");

        System.out.println("output:  " + m);

        // Accessing elements by key
        String age = m.get(25);
        System.out.println("John's age: " + age);

        for (Integer key : m.keySet()) {
            System.out.println("Key: " + key + ", Value: " + m.get(key));
        }

        System.out.println(" ");

        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        m.remove("IsDB");
                System.out.println(" ");

                System.out.println("2nd output:  " + m);


    }

}
