package org.example.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcFetch {
    public static void main(String[] args) {
        Connection connection = LoadAndCreateConnection.GetConnection();
        try{
            Statement statement = connection.createStatement();
            String query = "select * from student";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int Student_id = resultSet.getInt("student_id");
                String Firstname = resultSet.getString("firstname");
                String Lastname = resultSet.getString("lastname");
                String City = resultSet.getString("city");
                System.out.println(Student_id +" ,"+ Firstname +", " +Lastname +"," +City +",");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
