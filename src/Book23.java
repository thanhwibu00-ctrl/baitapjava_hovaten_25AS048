public class Book23 {
    private String isbn;
    private String title;
    private Author23 author23;
    private double price;
    private int qty;

    public Book23(String isbn, String title, Author23 author23, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author23 = author23;
        this.price = price;
    }
    public Book23(String isbn, String title, Author23 author23, double price, int qty) {
        this.isbn = isbn;
        this.title = title;
        this.author23 = author23;
        this.price = price;
        this.qty = 0;
    }
    public String getIsbn() {
        return isbn = "java for dummies";
    }
    public String getName() {
        return title;
    }
    public Author23 getAuthor() {
        return author23;
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
        return author23.getName();
    }
    public String toString() {
        return "Book[isbn=" + isbn + ",name="  + "," + author23.toString() +
                ",price=" + price + ",qty=" + qty + "]";
    }
}
