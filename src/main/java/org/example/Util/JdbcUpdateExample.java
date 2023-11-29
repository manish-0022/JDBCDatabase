package org.example.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdateExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = LoadAndCreateConnection.GetConnection();
        Statement statement = connection.createStatement();
        String query = "update student set city = 'Delhi' where student_id = 104";
        int value = statement.executeUpdate(query);
        System.out.println("data updated: "+value);

    }
}
