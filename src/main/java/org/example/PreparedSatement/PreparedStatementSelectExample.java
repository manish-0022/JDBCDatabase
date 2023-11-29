package org.example.PreparedSatement;

import org.example.Util.LoadAndCreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementSelectExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = LoadAndCreateConnection.GetConnection();
       String query = "select * from student where student_id = ? And city = ?";
       PreparedStatement preparedStatement =  connection.prepareStatement(query);
       preparedStatement.setInt(1,105);
       preparedStatement.setString(2, "jodhpur");
      ResultSet resultSet =  preparedStatement.executeQuery();
      while(resultSet.next()){
          int Student_id = resultSet.getInt("student_id");
          String Firstname = resultSet.getString("firstname");
          String Lastname = resultSet.getString("lastname");
          String City = resultSet.getString("city");
          System.out.println(Student_id +" ,"+ Firstname +", " +Lastname +"," +City +" ");
      }


    }
}
