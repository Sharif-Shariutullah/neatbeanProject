/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

/**
 *
 * @author B-5
 */
import java.io.*;

public class Binary {

    public static void main(String[] args) {
        // Write data to a binary file
        writeToFile("binaryFile.dat");

        // Read data from the binary file
        readFromFile("binaryFile.dat");
    }

    private static void writeToFile(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Writing integer and double values to the binary file
            dos.writeInt(42);
            dos.writeDouble(3.14);
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            // Reading integer and double values from the binary file
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();

            System.out.println("Read from file - Integer: " + intValue);
            System.out.println("Read from file - Double: " + doubleValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

}
