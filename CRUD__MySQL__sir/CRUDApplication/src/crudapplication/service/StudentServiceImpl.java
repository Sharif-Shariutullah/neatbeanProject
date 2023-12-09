/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication.service;

import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author B-4
 */
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

        List<Student> stuList = new ArrayList<>();
        
        for (String string : allLine) {
            stuList.add(getStudent(string));
        }
        
        return stuList;
    }

    @Override
    public Long deleteStudent(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Student getStudent(String data) {
        Student stu = new Student();
        String[] values = data.split(", ");
        for (String value : values) {
            String[] val = value.split("=");
            if (val.length == 2) {
                if ("id".equals(val[0])) {
                    stu.setId(Long.parseLong(val[1]));
                } else if ("name".equals(val[0])) {
                    stu.setName(val[1]);
                } else if ("address".equals(val[0])) {
                    stu.setAddress(val[1]);
                }
            }
        }
        return stu;
    }

    
    
//            final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");

    
//                 else if ("name".equals(val[0])) {
//                    stu.setName(val[1]);
//                } else if ("address".equals(val[0])) {
//                    stu.setAddress(val[1]);
//                } else if ("dob".equals(val[0])) {//"2023-11-30T16:11:49.689"
//                    LocalDateTime dateTime = LocalDateTime.parse(val[1], formatter);
//                    stu.setDob(dateTime);
//                } else if ("subject".equals(val[0])) {
//                    SubjectEnum stuEnum = SubjectEnum.JAVA;
//                    if (val[0].toUpperCase().equals("JAVA")) {
//                        stuEnum = SubjectEnum.JAVA;
//                    } else if (val[0].toUpperCase().equals("C")) {
//                        stuEnum = SubjectEnum.C;
//                    } else if (val[0].toUpperCase().equals("DOTNET")) {
//                        stuEnum = SubjectEnum.DOTNET;
//                    } else if (val[0].toUpperCase().equals("PHP")) {
//                        stuEnum = SubjectEnum.PHP;
//                    }
//                    stu.setSubject(stuEnum);
//                }
}
