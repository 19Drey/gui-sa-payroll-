package config;

public class Session {

    private static Session instance; // For singleton pattern
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String userType;
    private String status;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Private constructor for singleton pattern
    private Session() {
        // Initialize the session variables here if needed
    }

    // Static method to get the session instance (using double-checked locking for thread safety)
    public static Session getInstance() {
        if (instance == null) {
            synchronized (Session.class) {
                if (instance == null) {
                    instance = new Session();
                }
            }
        }
        return instance;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getfirstname() {
        return firstName; // Return the first name
    }

    public void clear() {
        int userId = this.userId;
        this.firstName = null;
        this.lastName = null;
        this.email = null;
        this.username = null;
        this.userType = null;
        this.status = null;
    }
}