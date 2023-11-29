package crudapplication.Service;

import crudapplication.Model.Student;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class StudentServiceIMPL implements StudentService {

    final static String pathDr = "H:\\Courses\\JAVA\\new";
    final static String path = "H:\\Courses\\JAVA\\new\\info.txt";

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
        Path sourceFile = Paths.get(path);
        Path targetFile = Paths.get(path);
        Charset charset = Charset.forName("ISO-8859-1");
        try {
            List<String> lines = Files.readAllLines(sourceFile, charset);
            lines.add(student.toString());
            Files.write(targetFile, lines, StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    @Override
    public Student getStudentByID(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long deleteStudent(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private File File(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
