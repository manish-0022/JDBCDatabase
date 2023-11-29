package org.example.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementInsetExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = LoadAndCreateConnection.GetConnection();
        Statement statement = connection.createStatement();
        String query = "insert into student(student_id,firstname,lastname,city) values(104,'Takshvi','Goyal','jaipur')";
        int value = statement.executeUpdate(query);
        System.out.println("data inserted in Table in student database: "+value);

    }
}
