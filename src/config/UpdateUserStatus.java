
package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUserStatus {

    // Database connection details (replace with your actual values)
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        // Example: Update the status of the user currently in the session
        Session session = Session.getInstance();
        if (session.getUserId() != null) { // Check if a user is logged in
            try {
                updateUserStatus(Integer.parseInt(session.getUserId()), "Active"); // Assuming userID is stored as string.
                System.out.println("User status updated successfully.");
                session.setStatus("Active"); //Update session object.
            } catch (SQLException e) {
                System.err.println("Error updating user status: " + e.getMessage());
                e.printStackTrace(); // Consider more robust error handling in production
            } catch (NumberFormatException e){
                System.err.println("Invalid User ID. Must be a number");
                e.printStackTrace();
            }
        } else {
            System.out.println("No user logged in to update.");
        }
    }

    public static void updateUserStatus(int userId, String newStatus) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // 1. Establish database connection
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. Prepare the SQL update statement
            String sql = "UPDATE users SET status = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);

            // 3. Set the parameters
            preparedStatement.setString(1, newStatus);
            preparedStatement.setInt(2, userId);

            // 4. Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected == 0) {
                System.out.println("User with ID " + userId + " not found.");
            }

        } finally {
            // 5. Close resources in reverse order of creation
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}