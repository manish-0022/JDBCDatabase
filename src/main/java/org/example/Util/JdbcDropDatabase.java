package org.example.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDropDatabase {
    public static void main(String[] args) throws SQLException {
        Connection connection = LoadAndCreateConnection.GetConnection();
        Statement statement = connection.createStatement();
        String sql = "drop database testdb";
        int value = statement.executeUpdate(sql);
        System.out.println("database dropped");

    }
}
