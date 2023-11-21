/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author B-5
 */
public class io {

    public static void main(String[] args) throws IOException {

        try {
            method();
            method22();
        } catch (IOException e) {
        };

    }

    public static void method() throws IOException {
        BufferedWriter bd = new BufferedWriter(new FileWriter("H:\\Courses\\JAVA\\Note\\aaa.txt"));

        bd.write("alskflahdfahdf");
        bd.close();
    }

    public static void method22() throws IOException {
        BufferedReader bd = new BufferedReader(new FileReader("aaa.txt"));

        String line;

        while ((line = bd.readLine()) != null) {
            System.out.println(line);
        }
        bd.close();
    }

}
