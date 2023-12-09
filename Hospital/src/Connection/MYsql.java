package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class MYsql {
     
    public static void main(String[] args) throws Exception {
        
               

        final String DB_CON = "jdbc:mysql://localhost:3306/hospital";
        final String USER_NAME = "root";
        final String PASSWORD = "root";

        try {

            String INSERT_QUERY = "insert into patient (ID, NAME, address, dob, dep) values(?,?,?,?,?)";
            Connection conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);
            
            int id = 301;
            String name = "Zaman 2";
            String address = "Gazipur- 2";
            String dob = "2020-02-03";
            int dep = 0;

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, address);
            pstmt.setString(4, dob);
            pstmt.setInt(5, dep);

            pstmt.executeUpdate();
          
        } catch (Exception e) {
            System.out.println(e);
        }

}
