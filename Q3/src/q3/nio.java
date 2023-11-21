/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author B-5
 */

  import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;
public class nio {



    public static void main(String[] args) {
        // File path
        Path filePath = Paths.get("nio_example.txt");

        // Write to the file
        writeToFile(filePath, "Hello, this is a sample text using Java NIO.");

        // Read from the file
        readFromFile(filePath);
    }

    // Method to write to a file using Java NIO
    private static void writeToFile(Path filePath, String content) {
        try {
            // Write the content to the file
            Files.write(filePath, content.getBytes(StandardCharsets.UTF_8));
            System.out.println("Content successfully written to the file using Java NIO.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read from a file using Java NIO
    private static void readFromFile(Path filePath) {
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);

            // Display the content read from the file
            System.out.println("Content read from the file using Java NIO:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
  
}
