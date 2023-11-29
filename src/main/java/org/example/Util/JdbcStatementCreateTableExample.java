package org.example.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementCreateTableExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = LoadAndCreateConnection.GetConnection();
        Statement statement = connection.createStatement();
        String query = "create table student(student_id int,firstname varchar(255),lastname varchar(255),city varchar(255))";
        int value = statement.executeUpdate(query);
        System.out.println("Table created in student database: "+value);

    }
}
