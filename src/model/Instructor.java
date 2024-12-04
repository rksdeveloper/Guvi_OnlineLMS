package model;

public class Instructor {
    private int instructorId;
    private String name;
    private String email;
    private String password;

    // Constructor
    public Instructor(int instructorId, String name, String email, String password) {
        this.instructorId = instructorId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters
    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
