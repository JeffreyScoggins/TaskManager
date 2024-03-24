package org.swe6673.user;

public class User {
    private String username;
    private String password;
    private String email;


    public User(String username, String password, String email) {
        this.username = username.toLowerCase();
        this.email = email;
        this.password = password;
    }

    public boolean exists(String testUser) {
        String user = getUsername();
        if (user.equals(testUser)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean validateEmail(String email) {
        return true;
    }

    public static boolean validateUsername(String username) {
        return true;
    }


    public static boolean register(String username, String password, String email) {

       return false;
    }

    public static boolean login(String username, String password) {
        // Retrieve user from database
        // Compare hashed passwords
        return true; // Return true if login is successful
    }

    public static boolean resetPassword(String username, String newPassword) {
        return true;
    }

    public void deleteUser(String username) {

        setUsername("");

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



