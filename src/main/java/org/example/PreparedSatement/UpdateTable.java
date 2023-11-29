package org.example.PreparedSatement;

import org.example.Util.LoadAndCreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable {
    private static void Updatedata(String city,String First_name,int Student_id) throws SQLException {

        Connection connection = LoadAndCreateConnection.GetConnection();
        String query = "update student set city=? And firstname=? where student_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,city);
        preparedStatement.setString(2,First_name);
        preparedStatement.setInt(3,Student_id);
        preparedStatement.executeUpdate();
        System.out.println("data updated");
    }

    public static void main(String[] args) throws SQLException {
        Updatedata("jaipur","yashavi",10);

    }
}
