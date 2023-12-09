/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySQLConnectoe;

import crudapplication.model.Student;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author B-4
 */
public class JDBCCOnfig3 {

    final String DB_CON = "jdbc:mysql://localhost:3306/school_m";
    final String USER_NAME = "root";
    final String PASSWORD = "root";

    public Connection getJdbcConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_CON, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        return conn;
    }

//    public static Connection getJdbcConnection() throws SQLException, IOException {
//        FileInputStream fis = new FileInputStream("E:\\Java_Programs_Eclipse\\GeneralStorePreparedStatement\\src\\in\\generalStore\\utility\\app.properties");
//        Properties properties = new Properties();
//        properties.load(fis);
//        Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
//        return connection;
//
//    }
    public static void CleanUpCodeForResources(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if (connection != null) {
            connection.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (resultSet != null) {
            resultSet.close();
        }

    }

    public void addStudent(Student stu) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        Scanner scanner = null;
        Integer noOfRowsInserted = null;
        try {
            connection = getJdbcConnection();
            if (connection != null) {
                String SqlInsertQuery = "insert into generalstore(ItemName,ItemPrice,ItemQuantity) values(?,?,?)";
                pstmt = connection.prepareStatement(SqlInsertQuery);
            }
            if (pstmt != null) {
                scanner = new Scanner(System.in);
                if (scanner != null) {

                    System.out.println("enter the itemName::");
                    String itemName = scanner.next();
                    System.out.println("enter the itemPrice::");
                    int itemPrice = scanner.nextInt();
                    System.out.println("enter the itemQuantity::");
                    int itemQuantity = scanner.nextInt();

                    pstmt.setNString(1, itemName);
                    pstmt.setInt(2, itemPrice);
                    pstmt.setInt(3, itemQuantity);
                }
            }
            noOfRowsInserted = pstmt.executeUpdate();
            System.out.println("no fo rows inserted is :" + noOfRowsInserted);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                CleanUpCodeForResources(connection, pstmt, null);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            scanner.close();
        }
    }

    public void getAllStudend() {

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rSet = null;
        try {
            connection = getJdbcConnection();
            if (connection != null) {
                String sqlSelectQuery = "select * from generalstore";
                pstmt = connection.prepareStatement(sqlSelectQuery);

            }
            if (pstmt != null) {
                rSet = pstmt.executeQuery();

            }
            if (rSet != null) {
                System.out.println("ItemId\tItemName\tItemPrice\tItemQuantity");
                while (rSet.next()) {

                    System.out.println(rSet.getInt(1) + "\t" + rSet.getString(2) + "\t\t" + rSet.getInt(3) + "\t\t" + rSet.getInt(4));
                }

            }
        } catch (SQLException si) {
            si.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                CleanUpCodeForResources(connection, pstmt, rSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void getStudend(Long id) {

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rSet = null;
        try {
            connection = getJdbcConnection();
            if (connection != null) {
                String sqlSelectQuery = "select * from generalstore where id = " + id;
                pstmt = connection.prepareStatement(sqlSelectQuery);

            }
            if (pstmt != null) {
                rSet = pstmt.executeQuery();

            }
            if (rSet != null) {
                System.out.println("ItemId\tItemName\tItemPrice\tItemQuantity");
                while (rSet.next()) {

                    System.out.println(rSet.getInt(1) + "\t" + rSet.getString(2) + "\t\t" + rSet.getInt(3) + "\t\t" + rSet.getInt(4));
                }

            }
        } catch (SQLException si) {
            si.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                CleanUpCodeForResources(connection, pstmt, rSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    public void updateStudend(Student stu, Long id) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        Integer noOfRowsAffected = null;
        Scanner scanner = null;

        try {
            connection = getJdbcConnection();
            if (connection != null) {
                String sqlUpdateQuery = "update generalstore set ItemName='CloseUp' where ItemId=?";
                pstmt = connection.prepareStatement(sqlUpdateQuery);

            }
            if (pstmt != null) {
                scanner = new Scanner(System.in);
                if (scanner != null) {
                    System.out.println("enter the id no for which you want to change ItemName::");
                    int itemId = scanner.nextInt();
                    pstmt.setInt(1, itemId);
                }
                noOfRowsAffected = pstmt.executeUpdate();
                System.out.println("no of rows updated is :" + noOfRowsAffected);
            }
        } catch (SQLException si) {
            si.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                CleanUpCodeForResources(connection, pstmt, null);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            scanner.close();
        }
    }

    public void deleteStudend(Long id) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        Integer noOfRowsAffectedInteger = null;
        Scanner scanner = null;
        try {
            connection = getJdbcConnection();
            if (connection != null) {
                String sqlDeleteQuery = "delete from generalstore where ItemId=?";
                pstmt = connection.prepareStatement(sqlDeleteQuery);

            }
            if (pstmt != null) {
                scanner = new Scanner(System.in);
                if (scanner != null) {
                    System.out.println("enter the id of the record you want to delete from the table:");
                    int idScanner = scanner.nextInt();
                    pstmt.setInt(1, idScanner);
                }
                noOfRowsAffectedInteger = pstmt.executeUpdate();
                System.out.println("no of rows deleted is :" + noOfRowsAffectedInteger);
            }
        } catch (SQLException si) {
            si.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                CleanUpCodeForResources(connection, pstmt, null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            scanner.close();
        }

    }

}
