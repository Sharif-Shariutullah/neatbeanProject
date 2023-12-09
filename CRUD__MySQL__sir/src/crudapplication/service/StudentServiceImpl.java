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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author B-4
 */
public class StudentServiceImpl implements StudentService {

    final static String DB_CON = "jdbc:mysql://localhost:3306/school_management";
    final static String USER_NAME = "root";
    final static String PASSWORD = "root";

    @Override
    public void addStudent(Student student) {
        Student stu = new Student();

        try {

            String INSERT_QUERY = "insert into student (ST_Name, address, dob, SUBJECT) values(?,?,?,?)";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);

            pstmt.setString(1, stu.getName());
            pstmt.setString(2, stu.getAddress());
            pstmt.setString(3, stu.getDob().toString());
            pstmt.setString(4, stu.getSubject().name());

            pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    @Override
    public Student getStudentByID(Long id) {
        Student stu = new Student();

        try {
            String INSERT_QUERY = "SELECT id, ST_Name, address, dob, SUBJECT FROM student where id = ?";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement prst = conn.prepareStatement(INSERT_QUERY);
            prst.setLong(1, id);
            ResultSet prs = prst.executeQuery();

            while (prs.next()) {

                stu.setId(prs.getLong("id"));
                stu.setName(prs.getString("ST_Name"));
                stu.setAddress(prs.getString("address"));
                stu.setDob(LocalDateTime.parse(prs.getString("dob")));
                stu.setSubject(SubjectEnum.valueOf(prs.getString("Subject")));

            }
            prst.close();
            prs.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return stu;
    }

    @Override
    public Integer updateStudent(Student stu, Long id) {
        Integer numberOfRow = 0;

        try {

            String INSERT_QUERY = "UPDATE student SET ST_Name = ?, address = ?, dob = ?, SUBJECT = ? WHERE ID = ?;";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);

            pstmt.setString(1, stu.getName());
            pstmt.setString(2, stu.getAddress());
            pstmt.setString(3, stu.getDob().toString());
            pstmt.setString(4, stu.getSubject().name());
            pstmt.setLong(5, id);

            numberOfRow = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

        return numberOfRow;
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();

        try {
            Student stu = new Student();
            String INSERT_QUERY = "SELECT id, ST_Name, address, dob, SUBJECT FROM student";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement prst = conn.prepareStatement(INSERT_QUERY);
            ResultSet prs = prst.executeQuery();

            while (prs.next()) {

                stu.setId(prs.getLong("id"));
                stu.setName(prs.getString("ST_Name"));
                stu.setAddress(prs.getString("address"));
                stu.setDob(LocalDateTime.parse(prs.getString("dob")));
                stu.setSubject(SubjectEnum.valueOf(prs.getString("Subject")));

                students.add(stu);
            }
            prst.close();
            prs.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return students;
    }

    @Override
    public Integer deleteStudent(Long id) {
        Integer numberOfRow = 0;
        try {
//            String INSERT_QUERY = " delete from student where id =  " + stuId;
            String INSERT_QUERY = " delete from student where id = ? ";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement prst = conn.prepareStatement(INSERT_QUERY);
            prst.setLong(1, id);
            numberOfRow = prst.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return numberOfRow;
    }

//    @Override
//    public void updateStudent() {
//        
//    
//    }
}
