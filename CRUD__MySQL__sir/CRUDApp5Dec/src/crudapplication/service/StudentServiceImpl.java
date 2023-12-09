
package crudapplication.service;

import crudapplication.model.Student;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    final static String pathDr = "D:\\test";
    final static String path = "D:\\test\\studentData.txt";

    @Override
    public void addStudent(Student student) {
        File fileDr = new File(pathDr);
        fileDr.mkdir();
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        Path targetFile = Paths.get(path);
        try {
            Files.write(targetFile, student.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    
    
    
    private List<String> readFile() {
    
        List<String> allLine = new ArrayList<>();

        File fileDr = new File(pathDr);
        fileDr.mkdir();
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        
        Path sourceFile = Paths.get(path);
        Charset charset = Charset.forName("ISO-8859-1");
        
        try {
            allLine = Files.readAllLines(sourceFile, charset);
        } catch (IOException e) {
            System.out.println(e);
        }
        return allLine;
    }
   
    
    
    
    
    @Override
    public Student getStudentByID(Long id) {
        return null;
    }

    @Override
    public void updateStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() {
        List<String> allLine = readFile();
        
        
        return null;
    }

    @Override
    public Long deleteStudent(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
