
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author B-5
 */
public class Buffer {

    public static void main(String[] args) throws IOException {

//        Buffer.wirteFile();

Buffer.ReadFile();
    }

    ;
     
     
     
     
    public static void wirteFile() throws IOException {

        BufferedWriter bf = new BufferedWriter(new FileWriter("abc.txt"));
        BufferedWriter bf2 = new BufferedWriter(new FileWriter("H:\\test\\xyz.txt"));
        BufferedWriter bf3 = new BufferedWriter(new FileWriter("H:\\test\\xyz.jpg"));
        BufferedWriter bf4 = new BufferedWriter(new FileWriter("H:\\test\\xyz.docx"));

        // write  01
        bf2.write("Hello bangladesh. \n I like you. \n I like you.\n I like you.\n I like you.\n I like you.\n I like you.");
        bf2.write("\n Hello bangladesh.  I like you.");

        bf2.close();

        // write  02
        bf4.write("Hello bangladesh. \n I like you. \n I like you.\n I like you.\n I like you.\n I like you.\n I like you.");
        bf4.write("\n Hello bangladesh.  I like you.");

        bf4.close();

    }

    ;
    
    public static void ReadFile() throws IOException {

        BufferedReader bfr = new BufferedReader(new FileReader("H:\\test\\xyz.txt"));
        
        
        // there is 1 way to write
        
        
        
//        String line = bfr.readLine();
//        System.out.println(line);
//        
//          line = bfr.readLine();
//        System.out.println(line);
//        
//          line = bfr.readLine();
//        System.out.println(line);
//        
//          line = bfr.readLine();
//        System.out.println(line);
//        
//          line = bfr.readLine();
//        System.out.println(line);
        
        
        
                // there is 2 way to write

                String line;
                while ((line = bfr.readLine()) !=null){
                    System.out.println(line);
                };
        
        
        bfr.close();
    }
;

}
