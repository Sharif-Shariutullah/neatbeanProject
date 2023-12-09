/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLconnection;

import java.sql.*;
import java.util.Scanner;

public class JDBconfig7thDecember {

    public static void main(String[] args) throws Exception {
        
                Scanner scanner = null;

        final String DB_CON = "jdbc:mysql://localhost:3306/school_management";
        final String USER_NAME = "root";
        final String PASSWORD = "root";

        try {
             scanner = new Scanner(System.in);
//             
             int idVar1 = scanner.nextInt();
             int idVar2 = scanner.nextInt();
             
             
//             01 way
//            String INSERT_QUERY = "SELECT ID, ST_Name, address, dob, SUBJECT FROM student where ID between " + idVar1 + " and " + idVar2;
            
            String INSERT_QUERY = "SELECT ID, ST_Name, address, dob, SUBJECT FROM student where ID between ? and ? ";

           
            
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement prst = conn.prepareStatement(INSERT_QUERY);
            
            prst.setInt(1, idVar1);
            prst.setInt(2, idVar2);
                        
            System.out.println(INSERT_QUERY);
//way 02
            ResultSet prs = prst.executeQuery();
            
//            way 01
//            ResultSet prs = prst.executeQuery(INSERT_QUERY);
            
          while (prs.next()) {
                Integer ID = prs.getInt("id");
                String ST_Name = prs.getString("st_name");
                String address = prs.getString("address");
                String dob = prs.getString("dob");
                Integer SUBJECT = prs.getInt("subject");

               
                System.out.println(ID + ", " + ST_Name + ", " + address + ", " + dob + ", " + SUBJECT);
             
            }
          
            prst.close();
            prs.close();
        } catch (Exception e) {
            System.out.println(e);
        }

//        try {
//            Connection connection = null;
//            PreparedStatement pstmt = null;
//            Integer noOfRowsInserted = null;
//
//            connection = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
//            if (connection != null) {
//                String SqlInsertQuery = "insert into student (id, NAME, address, dob, SUBJECT) values(?,?,?,?,?)";
//                pstmt = connection.prepareStatement(SqlInsertQuery);
//            }
//            if (pstmt != null) {
//
//                int id = 5;
//                String name = "Abdullah";
//                String address = "Noakhali";
//                String dob = "2020-02-03";
//                int sub = 3;
//
//                pstmt.setInt(1, id);
//                pstmt.setString(2, name);
//                pstmt.setString(3, address);
//                pstmt.setString(4, dob);
//                pstmt.setInt(4, sub);
//            }
//            noOfRowsInserted = pstmt.executeUpdate();
//            System.out.println("no fo rows inserted is :" + noOfRowsInserted);
//
//        } catch (Exception e) {
//
//        }
    }
}
