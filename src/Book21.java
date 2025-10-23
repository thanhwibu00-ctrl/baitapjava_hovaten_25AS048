public class Book21 {
    private String name ;
    private Author21 author21;
    private double price;
    private int qty = 0;
    public Book21(String name, Author21 author21, double price) {
        this.name = name;
        this.author21 = author21;
        this.price = price;
    }
    public Book21(String name, Author21 author21, double price, int qty) {
        this.name = name;
        this.author21 = author21;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public Author21 getAuthor(){
        return author21;
    }
    public double getPrice() {
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(Author21 author21){
        this.author21 = author21;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "Book[name=" + name  + ", author=" + author21 + ", price=" + price + ", qty=" + qty + "]";
    }
}
