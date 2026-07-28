// Author.java
class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // toString method for easy printing
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
