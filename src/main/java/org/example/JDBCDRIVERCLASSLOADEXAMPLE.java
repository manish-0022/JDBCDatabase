package org.example;

public class JDBCDRIVERCLASSLOADEXAMPLE {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");
        }catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            System.out.println("getting error in loading the JDBC driver");
        }
    }
}
