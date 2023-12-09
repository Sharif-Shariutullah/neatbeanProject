/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySQLConnectoe;


import java.sql.*;

public class JDBCConfig {
     public static void main(String[] args) {
      try (
         // Step 1: Construct a database 'Connection' object called 'conn'
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/sakila",
               "root", "root");   // For MySQL only
               // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
 
         // Step 2: Construct a 'Statement' object called 'stmt' inside the Connection created
         Statement stmt = conn.createStatement();
      ) {
         String strSelect = "select actor_id, first_name, last_name from actor";
         System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging
 
         ResultSet rset = stmt.executeQuery(strSelect);
 
         // Step 4: Process the 'ResultSet' by scrolling the cursor forward via next().
         //  For each row, retrieve the contents of the cells with getXxx(columnName).
         System.out.println("The records selected are:");
         int rowCount = 0;
         // Row-cursor initially positioned before the first row of the 'ResultSet'.
         // rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
         // It returns false if no more rows.
         while(rset.next()) {   // Repeatedly process each row
            String last_name = rset.getString("last_name");  // retrieve a 'String'-cell in the row
            String first_name = rset.getString("first_name");  // retrieve a 'double'-cell in the row
            int    actor_id   = rset.getInt("actor_id");       // retrieve a 'int'-cell in the row
            System.out.println(actor_id + ", " + first_name + ", " + last_name);
            ++rowCount;
         }
         System.out.println("Total number of records = " + rowCount);
 
      } catch(SQLException ex) {
         ex.printStackTrace();
      }  // Step 5: Close conn and stmt - Done automatically by try-with-resources (JDK 7)
   }
}
