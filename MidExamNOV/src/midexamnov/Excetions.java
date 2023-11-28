package midexamnov;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Excetions {

    public static void main(String[] args) throws IOException {

        // Arrithmatic
        try {
//
//            MathExp();
//            ArrayExp();
//            StrExp();
            IOExp();

        } catch (ArithmeticException m) {

            System.out.println(m);

        } catch (ArrayIndexOutOfBoundsException arr) {

            System.out.println(arr);

        } catch (NullPointerException a) {

            System.out.println(a);

        } catch (IOException m) {

            System.out.println(m);

        } finally {
            System.out.println("I am always finall");

        };

    }

    public static void MathExp() {
        int a = 5;
        int b = 0;

        int result = a / b;
        System.out.println("Division result:  " + result);
    }

    public static void ArrayExp() {

        int[] ar = {5, 7, 4, 1, 15, 9};

        System.out.println("Array result:  " + ar[9]);

    }

    public static void StrExp() {

        String idb = null;
        System.out.println("String result:    " + idb.length());
    }

    ;

    public static void IOExp() throws IOException {

        BufferedReader rd = new BufferedReader(new FileReader("H:\\Courses\\Exp.txt"));

        String showme;
        while ((showme = rd.readLine()) != null) {
            System.out.println(showme);
        }
        rd.close();

    }
;

}
