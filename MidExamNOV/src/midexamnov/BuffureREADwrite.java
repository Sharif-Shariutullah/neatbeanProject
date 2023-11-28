package midexamnov;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuffureREADwrite {

    public static void main(String[] args) {

        try {
            IOExpWritng();  // writng
//            IOExpREADING();  // Read

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void IOExpWritng() throws IOException {

        BufferedWriter Writing = new BufferedWriter(new FileWriter("H:\\Courses\\JAVA\\Note\\Exp.txt", true));
        Writing.write("Hello Abdullah, Assalamu alikum");
        Writing.close();

    }

    public static void IOExpREADING() throws FileNotFoundException, IOException {

//        BufferedReader rd = new BufferedReader(new FileReader("H:\\Courses\\Exp.txt"));
        BufferedReader rd = new BufferedReader(new FileReader("H:\\Courses\\JAVA\\Note\\Exp.txt"));

        String showme;
        while ((showme = rd.readLine()) != null) {
            System.out.println(showme);
        }
        rd.close();

    }

}
