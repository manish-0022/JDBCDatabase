package org.example.PreparedSatement;

import org.example.Util.LoadAndCreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementInsertExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = LoadAndCreateConnection.GetConnection();
        String query = "insert into student values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,10);
        preparedStatement.setString(2,"rohit");
        preparedStatement.setString(3,"Agrawal");
        preparedStatement.setString(4,"Nepal");
        preparedStatement.executeUpdate();
        System.out.println("data inserted");
        connection.close();
    }
}
