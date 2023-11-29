package org.example.PreparedSatement;

import org.example.Util.LoadAndCreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample1 {
    private static void InsertData(int student_id,String first_name,String Last_name,String City) throws SQLException {
        Connection connection = LoadAndCreateConnection.GetConnection();
        String query = "insert into student values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,student_id);
        preparedStatement.setString(2,first_name);
        preparedStatement.setString(3,Last_name);
        preparedStatement.setString(4,City);
        preparedStatement.executeUpdate();
        System.out.println("data inserted");
    }

    public static void main(String[] args) throws SQLException {
        InsertData(11, "Ankit","Goyal","Ranchi");
    }

}
