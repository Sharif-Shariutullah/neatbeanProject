/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLconnection;

import crudapplication.model.Student;
import crudapplication.model.SubjectEnum;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class JDBconfig7thDecember___03 {

    final static String DB_CON = "jdbc:mysql://localhost:3306/school_management";
    final static String USER_NAME = "root";
    final static String PASSWORD = "root";

    public static void main(String[] args) throws Exception {

Student stu = new Student();
stu.setName("Dr Zakir Naik");
stu.setAddress("India");
stu.setDob(LocalDateTime.now());
stu.setSubject(SubjectEnum.C);


        addStudent(stu);

    }

    public static void addStudent(Student stu) {

        try {

            String INSERT_QUERY = "insert into student (ST_Name, address, dob, SUBJECT) values(?,?,?,?)";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);

//            int id = 81;
//            String name = "Abdullah 2";
//            String address = "Noakhali- 2";
//            String dob = "2020-02-03";
//            int sub = 0;

//            pstmt.setLong(1, stu.getId());
            
            
            pstmt.setString(1, stu.getName());
            pstmt.setString(2, stu.getAddress());
            pstmt.setString(3, stu.getDob().toString());
            pstmt.setString(4, stu.getSubject().name());

            pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
;

}
