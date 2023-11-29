package org.example.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementDelete {
    public static void main(String[] args) {
        Connection connection = LoadAndCreateConnection.GetConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "delete from student where city='Delhi'";
            statement.executeUpdate(query);
            System.out.println("record is deleted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
