package jave2_2;

public class Author22 {
    private String name;
    private String email;
    private char gender;
    public Author22(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
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
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString() {
        return "Author22{" + "name=" + name + ", email=" + email + ", gender=" + gender + '}';
    }
}
