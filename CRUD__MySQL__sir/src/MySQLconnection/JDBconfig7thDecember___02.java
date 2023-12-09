/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLconnection;

import java.sql.*;
import java.util.Scanner;

public class JDBconfig7thDecember___02 {

    public static void main(String[] args) throws Exception {
        
               

        final String DB_CON = "jdbc:mysql://localhost:3306/school_management";
        final String USER_NAME = "root";
        final String PASSWORD = "root";

        try {

            String INSERT_QUERY = "insert into student (ID, ST_Name, address, dob, SUBJECT) values(?,?,?,?,?)";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);
            
            int id = 41;
            String name = "Abdullah 2";
            String address = "Noakhali- 2";
            String dob = "2020-02-03";
            int sub = 0;

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, address);
            pstmt.setString(4, dob);
            pstmt.setInt(5, sub);

            pstmt.executeUpdate();
          
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
