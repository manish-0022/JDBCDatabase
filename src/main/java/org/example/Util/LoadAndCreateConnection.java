package org.example.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadAndCreateConnection {
    public static Connection GetConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            System.out.println("getting error in loading the JDBC driver");
        }
        Connection connection = null;
        String user = "root";
        String Pwd = "root123";
        String URL = "jdbc:mysql://localhost:3306/student_db";
        try {
            connection = DriverManager.getConnection(URL, user, Pwd);
        } catch (SQLException sqlException) {
            System.out.println("Getting Error While Establishing the Connection");
        }
        if (connection != null) {
            System.out.println("connection established");
        } else {
            System.out.println("connection not established");
        }

        return connection;
    }
}



