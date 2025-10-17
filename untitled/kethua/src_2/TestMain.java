public class TestMain {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()

        Book21 dummyBook21 = new Book21("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook21);  // Test Book's toString()

// Test Getters and Setters
        dummyBook21.setPrice(29.95);
        dummyBook21.setQty(28);
        System.out.println("name is: " + dummyBook21.getName());
        System.out.println("price is: " + dummyBook21.getPrice());
        System.out.println("qty is: " + dummyBook21.getQty());
        System.out.println("Author is: " + dummyBook21.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook21.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook21.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book21 anotherBook21 = new Book21("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook21);  // toString()
    }
}