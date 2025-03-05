package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {

    public static Connection getConnect() {
        dbConnect instance = new dbConnect(); // Create a new instance
        return instance.getConnection();  
    }
    private Connection connect;

    public dbConnect() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_dbb", "root", "");
            System.out.println("Database connection successful!"); // Debugging
        } catch (SQLException ex) {
            System.err.println("Can't connect to database: " + ex.getMessage()); // Debugging
            connect = null; // Set connect to null on failure
        }
    }

    public Connection getConnection() {
        return connect;
    }

    public ResultSet getData(String query) throws SQLException {
        if (connect == null) {
            throw new SQLException("Database connection is not established.");
        }
        Statement stmt = connect.createStatement();
        return stmt.executeQuery(query);
    }

    // Function to save data
    public int insertData(String sql) {
        int result;
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            pst.close();
            result = 1;
        } catch (SQLException ex) {
            System.out.println("Connection Error: " + ex);
            result = 0;
        }
        return result;
    }

   
   
}