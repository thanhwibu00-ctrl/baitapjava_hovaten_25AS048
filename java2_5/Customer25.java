package java2_5;

public class Customer25 {
    private int id;
    private String name;
    private char gender;
    public Customer25(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Customer02{" + "id=" + id + ", name=" + name + ", gender=" + gender + '}';
    }
}
