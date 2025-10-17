public class Book {
    private String isbn;
    private String title;
    private Author author;
    private double price;
    private int qty;

    public Book(String isbn, String title, Author author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String isbn, String title, Author author, double price, int qty) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }
    public String getIsbn() {
        return isbn = "java for dummies";
    }
    public String getName() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorName() {
        return author.getName();
    }
    public String toString() {
        return "Book[isbn=" + isbn + ",name="  + "," + author.toString() +
                ",price=" + price + ",qty=" + qty + "]";
    }
}
