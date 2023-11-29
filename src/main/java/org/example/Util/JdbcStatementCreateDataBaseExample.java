package org.example.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementCreateDataBaseExample {
    public static void main(String[] args) throws SQLException {
       Connection connection =  LoadAndCreateConnection.GetConnection();
        Statement statement = connection.createStatement();
        String query = "create database Student_db";
        int value = statement.executeUpdate(query);
        System.out.println("Database Created: " +value);
    }
}
