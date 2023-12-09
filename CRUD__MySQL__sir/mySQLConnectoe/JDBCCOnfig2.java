/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySQLConnectoe;

import java.sql.*;

/**
 *
 * @author B-4
 */
public class JDBCCOnfig2 {

    public static void main /*(main method)*/(String[] args) throws Exception {
        final String DB_CON = "jdbc:mysql://localhost:3306/school_m";
        final String USER_NAME = "root";
        final String PASSWORD = "root";
        final String INSERT_QUERY = "SELECT id, NAME, address, dob, SUBJECT FROM student";
        try (
                Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
                PreparedStatement prst = conn.prepareStatement(INSERT_QUERY);) {
            ResultSet prs = prst.executeQuery(INSERT_QUERY);
            System.out.println("The records selected are:");
            int rowCount = 0;
            while (prs.next()) {   
                Integer id = prs.getInt("id"); 
                String name = prs.getString("name"); 
                String address = prs.getString("address"); 
                String dob = prs.getString("dob"); 
                Integer subject = prs.getInt("SUBJECT"); 

                // retrieve a 'int'-cell in the row
                System.out.println(id + ", " + name + ", " + address+ ", " + dob + ", " + subject);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);

            prs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
