package jave2_2;

public class TestMain {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author22[] authors = new Author22[2];
        authors[0] = new Author22("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author22("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        Book22 javaDummy = new Book22("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
    }
}
