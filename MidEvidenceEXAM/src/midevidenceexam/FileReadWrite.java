package midevidenceexam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;
import static javafx.scene.input.KeyCode.H;

public class FileReadWrite {

    public static void main(String[] args) throws IOException {

        Fwrite();
        Fread();

    }

    public static void Fwrite() throws IOException {

        BufferedWriter wr = new BufferedWriter(new FileWriter("H:\\Courses\\JAVA\\Book\\Messege.txt"));
        wr.write("Hello Sir, How are you?");        
         wr.close();
    }

    ;
    
     public static void Fread() throws FileNotFoundException, IOException {
         BufferedReader rd = new BufferedReader(new FileReader("H:\\Courses\\JAVA\\Book\\Messege.txt"));
    
         String line;
         while ((line = rd.readLine()) !=null) {             
             System.out.println(line);
         }
      rd.close();
     
     }
;
}
