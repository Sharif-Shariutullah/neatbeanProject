/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author B-5
 */
public class JDBconfig {

    public static void main (String[] args) throws Exception {
        final String DB_CON = "jdbc:mysql://localhost:3306/school_management";
        final String USER_NAME = "root";
        final String PASSWORD = "root";
        final String INSERT_QUERY = "SELECT id, st_name, address, dob, subject FROM student";
        try {
                Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
                PreparedStatement prst = conn.prepareStatement(INSERT_QUERY);
                 ResultSet prs = prst.executeQuery(INSERT_QUERY);
            System.out.println("The records selected are:");
           
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
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
