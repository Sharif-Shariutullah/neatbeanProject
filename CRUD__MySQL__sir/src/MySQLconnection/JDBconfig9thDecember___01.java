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

public class JDBconfig9thDecember___01 {

    final static String DB_CON = "jdbc:mysql://localhost:3306/school_management";
    final static String USER_NAME = "root";
    final static String PASSWORD = "root";

    public static void main(String[] args) throws Exception {

Student stu = new Student();
stu.setName("Dr Zakir Naik");
stu.setAddress("India");
stu.setDob(LocalDateTime.now());
stu.setSubject(SubjectEnum.C);


//        addStudent(stu);

        ReadStudent();

//        UpdateStudent(stu, 10l);

//        DeleteStudent(3l);

//        DeleteStudentWay02(3l);
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
  
    public static void ReadStudent() {
        
        
          try {
            String INSERT_QUERY = "SELECT id, ST_Name, address, dob, SUBJECT FROM student";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement prst = conn.prepareStatement(INSERT_QUERY);
            ResultSet prs = prst.executeQuery();
            while (prs.next()) {
                Integer id = prs.getInt("id");
                String name = prs.getString("ST_Name");
                String address = prs.getString("address");
                String dob = prs.getString("dob");
                Integer subject = prs.getInt("SUBJECT");
                System.out.println(id + ", " + name + ", "
                        + address + ", " + dob + ", " + subject);
            }
            prst.close();
            prs.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        
        
        
  };
    
    
     public static void UpdateStudent(Student stu, Long id) {
        
         try {

            String INSERT_QUERY = "UPDATE student SET ST_Name = ?, address = ?, dob = ?, SUBJECT = ? WHERE ID = ?;";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);

            
            pstmt.setString(1, stu.getName());
            pstmt.setString(2, stu.getAddress());
            pstmt.setString(3, stu.getDob().toString());
            pstmt.setString(4, stu.getSubject().name());
            pstmt.setLong(5, id);

            pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
         

    
    
     public static void DeleteStudent(Long stid) {
         try {
             
            String INSERT_QUERY = "DELETE FROM student WHERE id = ?";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);
            pstmt.setLong(1, stid);
            Integer numberofROW = pstmt.executeUpdate();
            System.out.println(numberofROW);
            if (numberofROW > 0) {
                 System.out.println("Done");
             }else{
                 System.out.println("No data found!");
             };
            pstmt.close();
            
         } catch (Exception e) {
             System.out.println(e);
         }
         
         
  };
     
      public static void DeleteStudentWay02(Long stid) {
         try {
             
             String INSERT_QUERY = "DELETE FROM student WHERE id = " + stid;
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);
//            pstmt.setLong(1, stid); 
            Integer numberofROW = pstmt.executeUpdate();
             System.out.println(numberofROW);
             if (numberofROW > 0) {
                 System.out.println("Done");
             }else{
                 System.out.println("No data found!");
             };
            pstmt.close();
            
         } catch (Exception e) {
             System.out.println(e);
         }
         
         
  };
}
