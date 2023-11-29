package org.example.PreparedSatement;

import org.example.Util.LoadAndCreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTable {
    public static void main(String[] args) throws SQLException {
        Connection connection = LoadAndCreateConnection.GetConnection();
        String query = "delete from student where student_id=? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,10);
        preparedStatement.executeUpdate();
        System.out.println("data deleted");
    }
}
